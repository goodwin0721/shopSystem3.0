package pers.goodwin.shopSystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import pers.goodwin.shopSystem.pojo.Cart;


/**
 * 操作数据库cart表，该表记录着用户的购物车信息
 * @author goodwin
 */
public interface CartMapper {
	/**
	 * 用户user添加amount件goods到购物车
	 * @param userId 	用户id
	 * @param goodsId 	商品id
	 * @param amount 	选择的商品数目
	 */
	public void addGoodsToCart(@Param("userId") Integer userId, @Param("goodsId") Integer goodsId,
			@Param("amount") Integer amount);
	
	/**
	 * 通过用户id和商品id获得一条购物车记录
	 * @param userId
	 * @param goodsId
	 * @return
	 */
	public Cart getCart(@Param("userId") Integer userId, @Param("goodsId") Integer goodsId);

	/**
	 * 修改user购物车中goods的数量
	 * @param userId
	 * @param goodsId
	 * @param amount
	 */
	public void updateGoodsAmount(@Param("userId") Integer userId, @Param("goodsId") Integer goodsId,
			@Param("amount") Integer amount);

	/**
	 * 通过用户id，将id为goodsId的单条记录从用户的购物车中移除
	 * @param userId
	 * @param goodsId
	 */
	public void removeGoodsFromCart(@Param("userId") Integer userId, @Param("goodsId") Integer goodsId);

	/**
	 * 通过用户id将该用户的购物车清空
	 * @param userId
	 */
	public void removeAllGoodsByUserId(Integer userId);

	/**
	 * 通过userId查询user的购物车信息
	 * @param userId
	 * @return
	 */
	public List<Cart> searchByUserId(Integer userId);
}
