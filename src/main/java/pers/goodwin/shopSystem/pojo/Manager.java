package pers.goodwin.shopSystem.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理员
 * @author goodwin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
	/**
	 * 管理员id
	 */
	private int id;
	/**
	 * 管理员也是一个用户，管理员作为用户时的id
	 */
	private int userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
