package pers.goodwin.shopSystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页查询时，页面的信息
 * @author goodwin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean<T> {
    /**
     * 当前页数
     */
    private int currPage;
    /**
     * 每页显示的记录数
     */
    private int pageSize;
    /**
     * 总记录数
     */
    private int totalCount;
    /**
     * 总页数，其值为totalCount/pageSize
     */
    private int totalPage;
    /**
     * 每页的显示的数据
     */
    private List<T> lists;
}
