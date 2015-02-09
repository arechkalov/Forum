package all;

public class Topic extends MyAbstracytClass {

	private String topicName;
	private Long authorId;
	private static Long staticId = 1L;

	public Topic(String topicName, User author) {
		setId(staticId++);
		authorId = author.getId();
		this.setTopicName(topicName);
		// set fields values
	}

	public String toString() {
		return topicName + " {" + getId() + "}";
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthor(Long authorId) {
		this.authorId = authorId;
	}

}
