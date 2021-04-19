package pers.goodwin.shopSystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品存入数据库的过渡模型
 * @author goodwin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDto {
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品名称
     */
    private String describe;
    /**
     * 商品价格
     */
    private Integer price;
    /**
     * 商品总数
     */
    private Integer sum;
    /**
     * 商品描述
     */
    private String classify;
    /**
     * 商品图片的base64格式字符串
     */
    private String base64Img;
}
