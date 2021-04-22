DROP  SCHEMA IF EXISTS login_project;

CREATE SCHEMA login_project;
-- 사용자
DROP  TABLE IF EXISTS login_project.users;

CREATE TABLE login_project.users(
	uid    INT 			AUTO_INCREMENT,
	id 	   VARCHAR(12)  NOT NULL UNIQUE COMMENT "아이디",
	passwd CHAR(41) 	NOT NULL COMMENT "비밀번호",
	email  VARCHAR(60)  COMMENT "이메일",
	PRIMARY KEY (uid)
)
COMMENT "사용자";

-- 게정권한 부여
GRANT ALL
on login_project.*
to 'user_login_project'@'localhost' identified by 'rootroot';

insert into login_project.users(id,passwd,email ) values("java1", password("java1"), "aaa@aaa.com");
select * from users where id = 'java1'and passwd = password("java1");