package all;

public class Main {

	public static void main(String[] args) {
		Utils.createDefaultData();

		System.out.println(Utils.findUserById(3L));
		/*
		 * System.out.println("User with most topics: " +
		 * Utils.findUserWithMostTopics());
		 */

		System.out.println("This mesage was posted by: "
				+ Utils.getPostAuthorByMessage("a"));

		// Utils.deleteUser(Utils.user1);

		Utils.deleteUserById(4L);

		Utils.addUser(new User("Jhon5", "email5", "pass5"));

		Utils.InfoAllUsers();
		Utils.updateUserById(2L, "Vova");
		Utils.InfoAllTopics();
		Utils.InfoAllUsers();

	}
}
