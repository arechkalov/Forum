package all;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Utils {

	private static Set<User> allUsers = null;
	private static Set<Topic> allTopics = null;
	private static Set<Post> allPosts = null;

	public static void createDefaultData() {

		User user1 = createUser("John1211", "email1", "pass1");
		User user2 = createUser("John2", "email2", "pass2");
		User user3 = createUser("John3", "email3", "pass3");
		User user4 = createUser("John4", "email4", "pass4");

		Topic topic1 = new Topic("Bikes", user1);
		Topic topic2 = new Topic("Frisbee", user2);
		Topic topic3 = new Topic("Design", user2);
		Topic topic4 = new Topic("Java", user1);

		Post post1 = new Post("When can I play ultimate frisbee with you?",
				user2, topic2);
		Post post2 = new Post("At 18 i p. m.", user1, topic2);
		Post post3 = new Post(
				"I need a good book for learning Java, can anyone help me with that?",
				user4, topic4);
		Post post4 = new Post(
				"What is the best tool for vector graphics Photoshop or Illustrator?",
				user3, topic3);

		allUsers = new LinkedHashSet<User>();
		allUsers.add(user1);
		allUsers.add(user2);
		allUsers.add(user3);
		allUsers.add(user4);

		allTopics = new LinkedHashSet<Topic>();
		allTopics.add(topic1);
		allTopics.add(topic2);
		allTopics.add(topic3);
		allTopics.add(topic4);

		allPosts = new LinkedHashSet<Post>();
		allPosts.add(post1);
		allPosts.add(post2);
		allPosts.add(post3);
		allPosts.add(post4);

	}

	public static User createUser(String userName, String email, String password) {

		return new User(userName, email, password);

	}

	public static User findUserWithMostTopics() {
		User mostTopicUser = allUsers.iterator().next();
		int maxcount = 0;

		for (User user : allUsers) {
			if (getTopicCountByUser(user) > maxcount) {
				maxcount = getTopicCountByUser(user);
				mostTopicUser = user;
			}
		}

		return mostTopicUser;
	}

	public static User findUserById(Long id) { //
		for (User user : allUsers) {
			if (user.getId().equals(id))
				return user;
		}
		return null;
	}

	public static void addUser(User user) {
		allUsers.add(user);

		// if id exists in allUsers id > update with new field values
		// else add new user to allUsers
	}

	public static Set<User> getAllUsers() {
		return allUsers;
	}

	public static Set<User> getPostAuthorByMessage(String message) {
		Set<User> users = new HashSet<User>();
		// User user = null;
		for (Post post : allPosts) {
			if (post.getMessage() != null
					&& post.getMessage().toLowerCase()
							.contains(message.toLowerCase()))
				for (User user : allUsers) {
					if (user != null && user.getId().equals(post.getAuthorId()))
						users.add(user);
				}
		}

		return users;
	}

	public static void deleteUser(User user) {

		// allUsers.remove(user);
	}

	public static void deleteUserById(Long id) {
		for (User user : allUsers) {
			if (user.getId().equals(id)) {

				allUsers.remove(user);
			}
		}
	}

	public static void InfoAllUsers() {
		System.out.println("________________________________");
		for (User user : allUsers) {
			System.out.println(" | " + user + " | " + getTopicCountByUser(user)
					+ " topics and " + getPostCountByUser(user) + " posts");
		}
		System.out.println("Most Topic User: " + findUserWithMostTopics());
	}

	public static void InfoAllTopics() {
		System.out.println("________________________________");
		for (Topic topic : allTopics) {
			System.out.println(" | " + topic + " | "
					+ getPostCountByTopic(topic) + " posts");
		}
		System.out.println("________________________________");
	}

	public static int getTopicCountByUser(User user) {
		int counter = 0;
		for (Topic topic : allTopics) {
			if (topic.getAuthorId() == user.getId()) {
				counter++;
			}
		}
		return counter;
	}

	public static int getPostCountByUser(User user) {
		int counter = 0;
		for (Post post : allPosts) {
			if (post.getAuthorId() == user.getId()) {
				counter++;
			}
		}
		return counter;
	}

	public static int getPostCountByTopic(Topic topic) {
		int counter = 0;
		for (Post post : allPosts) {
			if (post.getTopicId() == topic.getId()) {
				counter++;
			}
		}
		return counter;
	}

	public static void updateUserById(Long id, String name) {

		for (User user : allUsers) {
			if (user.getId().equals(id)) {

				user.setUserName(name);

			}

		}
	}
}
// maven, jpa, hibernate

// web: html, css, sevlets, ajax

// sql, spring, Spring MVC

// Agile Scrum
