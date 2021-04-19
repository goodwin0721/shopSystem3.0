package pers.goodwin.shopSystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 购物车商品展示模型
 * @author goodwin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartVo {
	private int goodsId;
	private String goodsName;
	/**
	 * 图片地址
	 */
	private String pictureUrl;
	/**
	 * 价格
	 */
	private int price;
	/**
	 * 商品数量
	 */
	private int amount;
	/**
	 * 小计
	 */
	private int aubtotal;



	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
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

	public int getAubtotal() {
		return aubtotal;
	}

	public void setAubtotal(int aubtotal) {
		this.aubtotal = aubtotal;
	}

	@Override
	public String toString() {
		return "CartShow [goodsId=" + goodsId + ", goodsName=" + goodsName + ", pictureUrl=" + pictureUrl + ", price="
				+ price + ", amount=" + amount + ", aubtotal=" + aubtotal + "]";
	}
	
}
