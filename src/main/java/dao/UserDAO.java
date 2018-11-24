package dao;

import org.apache.ibatis.annotations.Select;

import entity.User;

public interface UserDAO {

	@Select("select * from user where uname=#{param1} and pwd=#{param2}")
	User queryfind(String uname,String pwd);
}
