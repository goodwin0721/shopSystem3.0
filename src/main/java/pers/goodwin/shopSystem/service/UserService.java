package pers.goodwin.shopSystem.service;

import pers.goodwin.shopSystem.pojo.User;

/**
 * @author goodwin
 */
public interface UserService {
	/**
	 * 用户注册
	 * @param username
	 * @param password
	 * @param birthdate
	 * @param gender
	 * @return
	 */
	public boolean register(String username,String password,String birthdate,String gender);

	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	public User login(String username,String password);

	/**
	 * 判断用户是否为管理员
	 * @param user
	 * @return
	 */
	public boolean isManager(User user);

	/**
	 * 判断用户是否存在
	 * @param username
	 * @return
	 */
	public boolean isExist(String username);
}
