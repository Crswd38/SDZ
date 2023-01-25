package common;

public class MemberDTO {
	private int idx;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String regidate;
	
	public MemberDTO() {
		super();
	}
	
	public MemberDTO(int idx, String id, String pw, String name, String email, String regidate) {
		super();
		this.idx = idx;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.regidate = regidate;
	}
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegidate() {
		return regidate;
	}

	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}
}
