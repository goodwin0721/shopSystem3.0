package pers.goodwin.shopSystem.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import pers.goodwin.shopSystem.pojo.Goods;

/**
 * 操作good表，该表存储商品的id、名称、描述、价格、库存、图片地址、已售数量信息
 * @author goodwin
 */
public interface GoodsMapper {
	/**
	 * 通过商品id获得商品对象
	 * @param goodsId
	 * @return
	 */
	public Goods getGoods(Integer goodsId);

	/**
	 * 新增商品
	 * @param goods
	 */
	public void addGoods(Goods goods);

	/**
	 * 修改商品库存量，增加goods库存
	 * @param goodsId	商品id
	 * @param sum		增加的商品数量
	 */
	public void addGoodsStockById(@Param("goodsId")Integer goodsId,@Param("sum")Integer sum);

	/**
	 * 修改商品库存量，减少goods库存
	 * @param goodsId	商品id
	 * @param sum		减少的商品数量
	 */
	public void subGoodsStockById(@Param("goodsId")Integer goodsId,@Param("sum")Integer sum);

	/**
	 * 修改商品销售数量，增加已售数量
	 * @param goodsId	商品id
	 * @param sum		增加的已售商品数量
	 */
	public void addGoodsSoldById(@Param("goodsId")Integer goodsId,@Param("sum")Integer sum);

	/**
	 * 通过商品分类id，获得该分类下的商品集合
	 * @param classifyId	商品分类id
	 * @return				符合该分类的所有商品集合
	 */
	public List<Goods> getGoodsByClassifyId(Integer classifyId);

	/**
	 * 通过关键字，获得商品名称或描述带有关键字的商品集合
	 * @param keyword	关键字
	 * @return			商品名称或描述带有关键字的商品集合
	 */
	public List<Goods> getGoodsByKeyword(String keyword);

	/**
	 * 获得所有商品
	 * @return	所有商品集合
	 */
	public List<Goods> getAllGoods();

	/**
	 * 查询销量最高的前count个商品集合
	 * @param count	热卖数量
	 * @return		热卖商品集合
	 */
	public List<Goods> getHotSale(Integer count);

	/**
	 * 分页查询，limit查询主键在区间[start，start+size-1]内的全部商品
	 * @param map	存放SQL的limit查询参数start、size
	 * @return		符合条件的商品集合
	 */
	public List<Goods> getAllGoodsByPage(HashMap<String,Object> map);

	/**
	 * 分页查询，通过商品分类Id，查询商品分类为classifyId的第start~start+size-1条商品数据
	 * @param map	存放limit查询参数start、size和where查询参数classifyId
	 * @return		符合条件的商品集合
	 */
	public List<Goods> getGoodsByClassifyIdAndPage(HashMap<String,Object> map);

	/**
	 * 分页查询，通过关键字keyword，查询商品名称或描述存在关键字的第start~start+size-1条商品数据
	 * @param map	存放limit查询参数start、size和where查询参数keyword
	 * @return		符合条件的商品集合
	 */
	public List<Goods> getGoodsByKeywordAndPage(HashMap<String,Object> map);


	/**
	 * 查询商品总数目
	 * @return
	 */
	public Integer getCount();

	/**
	 * 查询指定商品分类的商品总数目
	 * @param classifyId 商品分类id
	 * @return
	 */
	public Integer getCountByClassifyId(Integer classifyId);

	/**
	 * 获得商品名称或描述存在关键字的商品总数目
	 * @param keyword	关键字
	 * @return
	 */
	public Integer getCountByKeyword(String keyword);

}
