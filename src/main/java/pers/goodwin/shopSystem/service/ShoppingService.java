package pers.goodwin.shopSystem.service;

import java.util.List;

import pers.goodwin.shopSystem.pojo.CartVo;
import pers.goodwin.shopSystem.pojo.IndentVo;

/**
 * @author goodwin
 */
public interface ShoppingService {
	/**
	 * 向购物车加入该商品
	 * @param userId
	 * @param goodsId
	 * @param amount
	 * @return
	 */
	public boolean addGoodsToCart(int userId, int goodsId, int amount);

	/**
	 * 当用户下单时，将结算的商品从用户购物车移除
	 * @param userId
	 * @param goodsId
	 * @return
	 */
	public boolean removeGoodsFromCart(int userId,int goodsId);

	/**
	 * 更新购物车中指定商品的商品数量
	 * @param userId
	 * @param goodsId
	 * @param amount
	 * @return
	 */
	public boolean updateGoodsAmountInCart(int userId,int goodsId,int amount);

	/**
	 * 用户在购物车结算所做的动作
	 * @param userId
	 * @return
	 */
	public boolean shopping(int userId);

	/**
	 * 通过用户id查看用户的购物车商品信息
	 * @param userId
	 * @return
	 */
	public List<CartVo> showUserCart(int userId);

	/**
	 * 通过用户id查看用户的购物车商品信息
	 * @param userId
	 * @return
	 */
	public List<IndentVo> showUserIndent(int userId);
}
