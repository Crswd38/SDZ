package common;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO extends JDBConnect{
	public MemberDAO() {
		super();
	}
	public MemberDTO getMemberDTO(String id, String pw) {
		MemberDTO dto=new MemberDTO();
		String sql="select * from member where id=? and pw=?";
		
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs=psmt.executeQuery();
			
			if(rs.next()) {
				dto.setIdx(rs.getInt("idx"));
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString(4));
				dto.setEmail(rs.getString(5));
				dto.setRegidate(rs.getString(6));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public void register(String id, String pw, String name, String email) {
		String sql="insert into member(id, pw, name, email, regidate) values(?, ?, ?, ?, current_timestamp)";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, email);
			psmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet dupid(String id) {
		String sql="select * from member where id=?";
		
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs=psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet dupname(String name) {
		String sql="select * from member where name=?";
		
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs=psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}