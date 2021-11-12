//package com.xiaohei.springbootmyabtisplus.enums;
//
///**
// * @Author liangyusheng@xiaomi.com
// * @Date 2021/11/12 4:06 下午
// * @Version 1.0
// * @Describtion
// */
//public class ExceptionEnum {
//    SERVICE_EX("", ""),
//    SYS_ERROR("100002", "系统异常"),
//    UNAUTHORIZED("401", "invalid token"),
//    SERVICE_NOT_FOUND_ERROR("100006", "不存在此接口"),
//    METHOD_NOT_ALLOWED("MEI_MEI-00004", "POST/GET 请求方式错误"),
//    JSON_DATA_ERROR("MEI_MEI-00005", "Json 数据格式错误"),
//    UNSUPPORTED_MEDIA_TYPE("MEI_MEI-00006", "请求数据类型不正确"),
//    DATABASE_FAILURE("MEI_MEI-00008", "数据库调用失败"),
//    DATABASE_FIELD_NOT_EXIST("MEI_MEI-0009", "数据库表字段缺失");
//
//    String errorCode;
//    String errorMsg;
//
//    private ExceptionEnum(String errorCode, String errorMsg) {
//        this.errorCode = errorCode;
//        this.errorMsg = errorMsg;
//    }
//
//    public String getErrorCode() {
//        return this.errorCode;
//    }
//
//    public void setErrorCode(String errorCode) {
//        this.errorCode = errorCode;
//    }
//
//    public String getErrorMsg() {
//        return this.errorMsg;
//    }
//
//    public void setErrorMsg(String errorMsg) {
//        this.errorMsg = errorMsg;
//    }
//}
