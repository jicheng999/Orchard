package pers.hc.orchard.common.vo;

import java.util.Map;

/**
 * Created by liujicheng on 2019/5/25.
 * 分页请求vo
 */
public class BasePageRequestVo extends BaseRequestVo {
    private Integer pageIndex;
    private Integer pageSize;
    Map<String,Object> conditions;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Map<String, Object> getConditions() {
        return conditions;
    }

    public void setConditions(Map<String, Object> conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "BasePageRequestVo{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", conditions=" + conditions +
                '}';
    }
}
