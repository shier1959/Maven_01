package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDAO;
import entity.User;

@Service
@Transactional
public class UserService {

	
	@Autowired
	UserDAO userdao;
	
	public User queryfind(String uname,String pwd){
		User queryfind = userdao.queryfind(uname, pwd);
		return queryfind;
	}
}
