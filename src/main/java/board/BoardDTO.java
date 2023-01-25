package board;

import java.sql.Date;

public class BoardDTO {
	private String num;
	private String title;
	private String content;
	private String visitcount;
	private Date postdate;
	private String id;
	
	public BoardDTO() {
		super();
	}
	
	public BoardDTO(String num, String title, String content, String visitcount, Date postdate, String id) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.visitcount = visitcount;
		this.postdate = postdate;
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getVisitcount() {
		return visitcount;
	}

	public void setVisitcount(String visitcount) {
		this.visitcount = visitcount;
	}

	public Date getPostdate() {
		return postdate;
	}

	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
