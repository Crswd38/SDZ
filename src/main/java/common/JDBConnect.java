package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnect {
    public Connection conn;
    public Statement stmt;
    public PreparedStatement psmt;
    public ResultSet rs;
    
    public JDBConnect() {
    	try {
            String url = "jdbc:mysql://localhost:3306/sdz";
            String id = "root";
            String pw = "0000";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url, id, pw);
            
            System.out.println("DB 연결 완료!");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void close() {
        try {
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
            if(psmt != null) psmt.close();
            if(conn != null) conn.close();
            
            System.out.println("JDBC 자원 반납완료~");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}