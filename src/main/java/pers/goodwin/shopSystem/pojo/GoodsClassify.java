package pers.goodwin.shopSystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品分类模型
 * @author goodwin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsClassify {
	/**
	 * 分类的id
	 */
	private int id;
	/**
	 * 分类名称
	 */
	private String classify;
	/**
	 * 该分类下的商品总数
	 */
	private int sum;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
