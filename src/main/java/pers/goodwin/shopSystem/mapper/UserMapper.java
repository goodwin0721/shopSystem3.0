package pers.goodwin.shopSystem.mapper;


import pers.goodwin.shopSystem.pojo.User;

/**
 * @author goodwin
 */
public interface UserMapper {
	/**
	 * 通过username获得User实例
	 * @param username
	 * @return
	 */
	public User getUserByUsername(String username);

	/**
	 * 通过形参user中的数据username、password，验证获得数据库中符合的User实例
	 * @param user	存放username、password的User形参
	 * @return
	 */
	public User getUserByPassword(User user);

	/**
	 * 向user表增加一条记录
	 * @param user
	 */
	public void addUser(User user);

	/**
	 * 将指定id的用户注册为管理员，向管理员manager表新增一条记录
	 * @param userId	用户id
	 */
	public void addManager(Integer userId);

	/**
	 * 判断指定用户是否为管理员
	 * @param user	用户
	 * @return
	 */
	public Integer isManager(User user);
}
