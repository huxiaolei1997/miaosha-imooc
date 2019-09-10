package com.miaosha.miaosha.error;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年09月09日 22:25 胡晓磊 Exp $
 */
public class BusinessException extends Exception implements CommonError {
    private CommonError commonError;

    // 直接接收EmBuinessError的传参用于构造业务异常
    public BusinessException(CommonError commonError) {
        this.commonError = commonError;
    }

    public BusinessException(CommonError commonError, String errMsg) {
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
