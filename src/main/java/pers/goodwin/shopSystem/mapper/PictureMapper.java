package pers.goodwin.shopSystem.mapper;

/**
 * @author goodwin
 */
public interface PictureMapper {
	/**
	 * 将图片的base64数据解析为图片，存入该项目的/WEB-INF/goodsPictures文件夹中，存放成功将返回该图片的URL
	 * @param base64	图片的base64数据字符
	 * @return			图片的URL
	 */
	public String addPictureByBase64(String base64);
}
