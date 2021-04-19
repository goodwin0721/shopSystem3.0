package pers.goodwin.shopSystem.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;


/**
 * @author goodwin
 */
public class PictureUtil {

	/**
	 * 将base64格式文件转成图片，存起来，返回图片名
	 * @author goodwin
	 * @param base64Img 图片的base64数据
	 * @return url 		返回base64转换成图片的文件名
	 */
	public String savePictureByBase64(String base64Img) {
		//默认
		String url = "1.jpg";
		String[] pictureMsg = base64Img.split(",");
		//System.out.println(base64Img);
		//生成图片名
		//形如：1604854998966
		String time = String.valueOf(System.currentTimeMillis());
		int beginIndex = pictureMsg[0].indexOf("/") + 1;
		int endIndex =  pictureMsg[0].indexOf(";");
		//形如"jpeg"
		String type = pictureMsg[0].substring(beginIndex, endIndex);
		//形如：1604854998966.jpeg
		url = time + "." + type;
		File file = new File(this.getClass().getClassLoader().getResource("../").getPath()+ "goodsPictures/" + url);
		//String realPath	=  file.getAbsolutePath();
		//System.out.println(realPath);
		//输出G:\JavaWorkspace\shopSystem\target\shopSystem-3.0-SNAPSHOT\WEB-INF\goodsPictures\1615403203959.jpeg
		
		//保存的服务器地址
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e2) {
				System.out.println("创建文件失败");
				return "1.jpg";
			}
		}
		Base64.Decoder decoder = Base64.getDecoder();
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
		} catch (FileNotFoundException e1) {
			System.out.println("文件没找到");
			return "1.jpg";
		}
		try {
			// Base64解码
			byte[] b = decoder.decode(pictureMsg[1]);
			for (int i = 0; i < b.length; ++i) {
				// 调整异常数据
				if (b[i] < 0) {
					b[i] += 256;
				}
			}
			out.write(b);
			out.flush();
			out.close();
			return url;
		} catch (Exception e) {
			//异常返回默认路径
			return "1.jpg";
		}
	}

}
