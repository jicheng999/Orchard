package pers.hc.orchard.common.vo;

/**
 * Created by liujicheng on 2019/5/25.
 */
public class PageResponseVo extends BaseResponseVo{

    private ResponsePageInfo pageInfo = new ResponsePageInfo();

    public ResponsePageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ResponsePageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public static PageResponseVo getSuccessVo() {
        PageResponseVo vo = new PageResponseVo();
        vo.setSuccess(SUCCCESS);
        return vo;
    }

    public static PageResponseVo getFailVo() {
        PageResponseVo vo = new PageResponseVo();
        vo.setSuccess(FALSE);
        return vo;
    }
}
