package login_project.dto;

public class Member {
	private String id;
	private String passwd;
	private String email;
	
	public Member(String id) {
		super();
		this.id = id;
	}

	public Member(String id, String passwd) {	
		this.id = id;
		this.passwd = passwd;
	}

	public Member(String id, String passwd, String email) {
		this.id = id;
		this.passwd = passwd;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("Member [id=%s, passwd=%s, email=%s]", id, passwd, email);
	}
	
	
}
