package login_project.dao;

import login_project.dto.Member;

public interface LoginDao {

	Member selectLLoginMember(String id, String passwd);
}
