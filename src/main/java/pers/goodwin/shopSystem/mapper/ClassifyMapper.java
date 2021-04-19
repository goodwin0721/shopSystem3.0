package pers.goodwin.shopSystem.mapper;

import org.apache.ibatis.annotations.Param;

import pers.goodwin.shopSystem.pojo.GoodsClassify;

/**
 * @author goodwin
 */
public interface ClassifyMapper {
	/**
	 * 获得商品分类对象
	 * @param classify	商品分类
	 * @return
	 */
	public GoodsClassify getClassify(String classify);

	/**
	 * 获得商品分类的分类id
	 * @param classify	商品分类
	 * @return
	 */
	public Integer getClassifyId(String classify);

	/**
	 * 获得指定分类下的商品总数
	 * @param classify	商品分类
	 * @return
	 */
	public Integer getSumByClassify(String classify);

	/**
	 * 通过商品分类id，增加该分类的商品总数
	 * @param classifyId	商品分类id
	 * @param sum			商品总数增加量
	 */
	public void increaseSumById(@Param("classifyId") Integer classifyId,@Param("sum") Integer sum);

	/**
	 * 通过商品分类，增加该分类的商品总数
	 * @param classify	商品分类
	 * @param sum		商品总数增加量
	 */
	public void increaseSum(@Param("classify") String classify,@Param("sum") Integer sum);
}
