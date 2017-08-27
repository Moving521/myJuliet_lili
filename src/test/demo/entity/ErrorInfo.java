package entity;

import annotionDemo.MethodParam;
import annotionDemo.ParamInfo;

/**
 * Created by MrSpin on 2017/8/22.
 */
public class ErrorInfo {
    @ParamInfo(type = "String",value = "姓名")
    private String name; // 姓名
    @ParamInfo(type = "String",value = "身份证")
    private String idCard; // 身份证
    @ParamInfo(type = "String",value = "错误状态")
    private String status; // 错误状态
    @ParamInfo(type = "String",value = "错误信息")
    private String message; // 错误信息

    public ErrorInfo() {
    }

    public  ErrorInfo newInstance(){
        return new ErrorInfo();

    }
    public  ErrorInfo(String name,String idCard,String status,String message){
        this.name = name;
        this.idCard = idCard;
        this.status = status;
        this.message = message;
    }

    public String getName() {
        return name;
    }
    @MethodParam(type = "String", name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
