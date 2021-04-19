package pers.goodwin.shopSystem.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单的展示模型，存放在网页展示的订单信息
 * @author goodwin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndentVo {
	/**
	 * 商品id
	 */
	private int goodsId;
	/**
	 * 商品名称
	 */
	private String goodsName;
	/**
	 * 商品图片地址
	 */
	private String pictureUrl;
	/**
	 * 商品价格
	 */
	private int price;
	/**
	 * 商品数量
	 */
	private int amount;
	/**
	 * 小计，其值为price*amount
	 */
	private int aubtotal;
	/**
	 * 商品的交易时间
	 */
	private String tradeTime;



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

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	@Override
	public String toString() {
		return "IndentShow [goodsId=" + goodsId + ", goodsName=" + goodsName + ", pictureUrl=" + pictureUrl + ", price="
				+ price + ", amount=" + amount + ", aubtotal=" + aubtotal + ", tradeTime=" + tradeTime + "]";
	}

}
