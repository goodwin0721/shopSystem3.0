package pers.goodwin.shopSystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单模型
 * @author goodwin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Indent {
	/**
	 * 订单id
	 */
	private int id;
	/**
	 * 该订单所属用户的id
	 */
	private int userId;
	/**
	 * 订单的商品id
	 */
	private int goodsId;
	/**
	 * 订单生成时的商品价格
	 */
	private int price;
	/**
	 * 商品的数量
	 */
	private int amount;
	/**
	 * 订单生成时的时间
	 */
	private String tradeTime;

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

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	@Override
	public String toString() {
		return "Indent [id=" + id + ", userId=" + userId + ", goodsId=" + goodsId + ", price=" + price + ", amount="
				+ amount + ", tradeTime=" + tradeTime + "]";
	}

}
