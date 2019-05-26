package pers.hc.orchard.common.vo;

import java.io.Serializable;

/**
 * Created by liujicheng on 2019/5/25.
 * response基类
 */
public  class BaseResponseVo implements Serializable {


    public static final int SUCCCESS = 1;
    public static final int FALSE = 0;
    private static final long serialVersionUID = 6307763435162058548L;

    private int success;
    private String message;
    Object body;

    public static BaseResponseVo getSuccessVo(){
        BaseResponseVo vo = new BaseResponseVo();
       vo.setSuccess(SUCCCESS);
       return vo;
    }

    public static BaseResponseVo getFailVo(){
        BaseResponseVo vo = new BaseResponseVo();
        vo.setSuccess(FALSE);
        return vo;
    }


    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
