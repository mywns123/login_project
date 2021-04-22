package login_project.service;

import java.sql.Connection;

import login_project.dao.impl.LoginDaoImpl;
import login_project.ds.JndiDs;
import login_project.dto.Member;


public class LoginService {
	private LoginDaoImpl dao = LoginDaoImpl.getInstance();
	private Connection con = JndiDs.getConnection();
	
	public LoginService() {
		dao.setCon(con);
	}
	
	public Member getLogin(String id, String passwd) {
		return dao.selectLLoginMember(id, passwd);
	}
}
