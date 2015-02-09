package all;


public class User extends MyAbstracytClass {

	private String userName;
	private String email;
	private String password;
	// @OneToMany
	/*
	 * private Set<Topic> topics; // @OneToMany private Set<Post> posts;
	 */

	private static Long staticId = 1L;

	public User(String userName, String email, String password) {
		setId(staticId++);
		this.userName = userName;
		setEmail(email);
		setPassword(password);
	}

	@Override
	public String toString() {
		return userName + " {" + getId() + "}";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
