package pers.goodwin.shopSystem.mapper;

import java.util.List;

import pers.goodwin.shopSystem.pojo.Indent;

/**操作indent表
 * @author goodwin
 */
public interface IndentMapper {
	/**
	 * 增加一条商品订单记录
	 * @param indent
	 */
	public void addGoodsToIndent(Indent indent);

	/**
	 * 通过用户id查询该用户的订单信息
	 * @param userId	用户id
	 * @return			该用户的历史订单集合
	 */
	public List<Indent> searchByUserId(Integer userId);
}
