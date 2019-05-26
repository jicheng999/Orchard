package pers.hc.orchard.common.vo;

import java.io.Serializable;

/**
 * Created by liujicheng on 2019/5/25.
 */
public class ResponsePageInfo implements Serializable {


    private static final long serialVersionUID = 4003760323276851420L;

    private int pageIndex;
    private int total;
    private int pageSize;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
