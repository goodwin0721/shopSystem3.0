package pers.goodwin.shopSystem.service;

import pers.goodwin.shopSystem.pojo.Goods;
import pers.goodwin.shopSystem.pojo.GoodsDto;
import pers.goodwin.shopSystem.pojo.PageBean;

import java.util.List;

/**
 * @author goodwin
 */
public interface GoodsService {
	/**
	 * 新增一项商品信息
	 * @param goodsDto	新增商品信息包装类
	 * @return
	 */
    public boolean addGoods(GoodsDto goodsDto);

	/**
	 * 新增一项商品信息
	 * @param name		商品名称
	 * @param describe	商品描述
	 * @param price		价格
	 * @param stock		库存
	 * @param classify	分类
	 * @param base64Img	图片的base64字符信息
	 * @return
	 */
	public boolean addGoods(String name, String describe, int price, int stock, String classify,String base64Img);

	/**
	 * 增加指定id的商品库存量
	 * @param goodsId	商品id
	 * @param count		增加数量
	 * @return
	 */
	public boolean addStockById(String goodsId,String count);

	/**
	 * 减少指定id的商品库存量
	 * @param goodsId	商品id
	 * @param count		减少数量
	 * @return
	 */
	public boolean subStockById(String goodsId,String count);

	/**
	 * 获得所有商品
	 * @return
	 */
	public List<Goods> getAll();

	/**
	 * 通过商品分类查询商品
	 * @param classify	商品分类
	 * @return
	 */
	public List<Goods> searchByClassify(String classify);

	/**
	 * 通过关键字查询商品
	 * @param keyword	关键字
	 * @return
	 */
	public List<Goods> searchByKeyword(String keyword);

	/**
	 * 获得count个热销商品的列表
	 * @return
	 */
	public List<Goods> getHotSale();

	/**
	 * 分页查询，查询指定页数的商品信息
	 * @param currentPage	当前页
	 * @return				当前页的商品集合
	 */
	public PageBean<Goods> pagedQuery(int currentPage);

	/**
	 * 分页查询，通过商品分类，查询指定页数的商品信息
	 * @param classify		商品分类
	 * @param currentPage	当前页
	 * @return				该分类下，当前页商品集合
	 */
	public PageBean<Goods> pagedQueryByClassify(String classify,int currentPage);

	/**
	 * 分页查询，通过关键字，查询指定页数的商品信息
	 * @param keyword		关键字
	 * @param currentPage	当前页
	 * @return				符合该关键字的当前页商品集合
	 */
	public PageBean<Goods> pagedQueryByKeyword(String keyword,int currentPage);
}
