package board;

import java.util.List;
import java.util.Map;
import java.util.Vector;

public class BoardDAO extends common.JDBConnect{
	public BoardDAO() {
		super();
	}
	
	public List<BoardDTO> selectList(Map<String, Object> map) {
		List<BoardDTO> bbs = new Vector<BoardDTO>();
		String query = "SELECT * FROM board";
		if (map.get("searchWord") != null) {
			query += " LIKE '%" + map.get("searchWord") + "%'";
		}query += " ORDER BY num DESC ";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
	
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setVisitcount(rs.getString("visitcount"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setId(rs.getString("id"));
				bbs.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return bbs;
	}
}
