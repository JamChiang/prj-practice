package com.pinyougou.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author JW
 * @createTime 2018/10/18 5:31 PM
 * @desc todo
 *
 * 因为service是通过服务器传输给web,
 * 所以需要通过serializable进行把内存的数据序列化为字符串才能进行传输,
 * 同样web需要通过反序列化
 */
public class PageResult implements Serializable {
    private Long total;

    private List<?> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public PageResult(Long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
