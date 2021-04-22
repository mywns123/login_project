package login_project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import login_project.dao.LoginDao;
import login_project.dto.Member;

public class LoginDaoImpl implements LoginDao {
	private static final LoginDaoImpl Instance = new LoginDaoImpl();
	private Connection con;
		
	public void setCon(Connection con) {
		this.con = con;
	}

	public static LoginDaoImpl getInstance() {
		return Instance;
	}

	@Override
	public Member selectLLoginMember(String id, String passwd) {
	String sql="select id  from users where id = ? and passwd =password(?)";
	try (PreparedStatement pstmt = con.prepareStatement(sql)) {
		pstmt.setString(1, id);
		pstmt.setString(2, passwd);
		try (ResultSet rs = pstmt.executeQuery();) {
			if (rs.next()) {
				return getMember(rs);
			}
		}		
	} catch (Exception e) {
		e.printStackTrace();
	}
		return null;
	}

	private Member getMember(ResultSet rs) throws SQLException {
		String id = rs.getString("id");
		/* String passwd = rs.getString("passwd"); */
		return new Member(id);
	}

}
