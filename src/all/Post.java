package all;

//@Entity
//@Table(name = "post")
public class Post extends MyAbstracytClass {

	// @Column
	private String message;
	// @ManyToOne
	private Long authorId;
	private Long topicId;
	// @Column
	private static Long staticId = 1L;

	// add user
	// add post

	public Post(String message, User author, Topic topic) {
		// add new parameters: user, post
		setId(staticId++);
		authorId = author.getId();
		topicId = topic.getId();

		this.message = message;

	}

	public Long getAuthorId() {
		return authorId;
	}

	public Long getTopicId() {
		return topicId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
