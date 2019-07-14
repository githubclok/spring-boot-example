package com.example.demo.enums;

import io.swagger.annotations.ApiResponse;
import lombok.Getter;

/**
 * @author: lingjun.jlj
 * @date: 2019-03-26 10:25
 * @description:
 */
@Getter
public enum ResponseCodeEnum {

    /**
     * 系统响应
     */
    FAIL(1000, "请求失败"),
    SUCCESS(10000, "请求成功"),
    TOKEN_VERIFY_ERROR(10001, "身份验证失败"),
    PARAM_VALIDATE_ERROR(10002, "参数校验异常"),
    ACCOUNT_NOT_EXIST(10003, "用户名不存在"),
    PASSWORD_NOT_CORRECT(10004, "密码不正确"),
    PARAM_ERROR(10005, "参数错误"),
    VERIFY_CODE_ERROR(10006, "手机号或验证码错误"),
    USER_PASSWORD_ERROR(10007, "手机或密码错误"),
    PHONE_CODE_ERROR(10008, "手机号码格式错误"),
    LOGIN_FAIL(10009, "用户请登录"),
    PHONE_NOT_THE_PERSON(10010, "手机号码和个人不符合"),
    PHONE_NOT_EXIST(10011, "手机号码不存在，请注册"),
    PHONE_EXIST(10012, "手机号码已注册"),
    CODE_TIME_OUT(10007, "验证码已失效，请重新发送"),

    WECHAT_GET_OPENID_ERROR(11001, "获取用户微信失败"),
    WECHAT_ACCESS_TOKEN(11002, "Access_Token获取失败"),
    WECHAT_SEND_MESSAGE(11003, "微信发送消息失败"),

    ADMIN_ADD_BANK_USER(20001, "当前有其他管理员正在添加用户，请稍后再试"),

    FILE_SERVER_ERROR(30001, "文件服务上传异常"),
    FILE_TYPE_INVALID(30002, "文件类型非法"),
    FILE_SIZE_TOO_LARGE(30003, "上传文件太大"),
    FILE_SERVER_DOWNLOAD_ERROR(30004, "文件下载失败"),
    FILE_SERVER_URL_ERROR(30005, "文件路径错误"),
    FILE_SERVER_URL_EMPTY(30006, "文件路径不能为空"),
    FILE_URL_NOT_EXIST(30007, "文件路径不存在"),

    ID_CARD_VERIFY_ERROR(30010, "身份证识别错误，请重新上传"),
    ID_CARD_EMBLEM_ERROR(30011, "请上传身份证国徽面"),
    ID_CARD_FACE_POSITIVE(30012, "请上传正向的身份证人脸面"),
    RANDOM_NUMBER_ERROR(30101, "获取活体检测随机数失败，请重新再试"),
    VALIDATE_VIDEO_TOKEN_LOSS(30102, "活体认证失败，请重新获取活体检测随机数"),
    VALIDATE_VIDEO_FAIL(30103, "活体认证失败，请重新进行活体检测"),
    LIVE_VERIFY_SCORE_LOW(30104, "活体检测比对分数过低，请重新再试"),
    ID_CARD_TIMEOUT_ERROR(30104, "身份证识别失效，请重新上传验证"),
    LIVE_VERIFY_SR_ERROR(30105, "语音识别不符合"),
    LIVE_VERIFY_NOT_SYNCHRONIZED(30105, "视频中唇语识别错误"),

    SIGN_ERROR(32000, "合同签署失败"),
    SIGN_NOT_SEAL(32001, "请签名后进行签署"),
    SIGN_NOT_THIS_CONTRACT(32002, "该合同为签署"),

    ACCOUNT_HAS_USED(33001, "同一身份证不能在多个账号中进行业务申请"),

    ORDER_STATUS_ILLEGAL(40001, "订单状态非法"),
    ORDER_BACK_ILLEGAL(40002, "订单状态非法"),
    ORDER_OPERATE_DUPLICATE(40003, "正在操作订单，请稍后再试"),

    SIGN_ILLEGAL_REQUEST(50000, "面签单不存在"),
    SIGN_NOT_EXIST(50001, "面签单不存在"),
    SIGN_STATUS_ILLEGAL(50002, "面签单状态非法"),
    SIGN_CUSTOMER_ILLEGAL(50003, "当前请求用户非法"),
    SIGN_NO_FREE_SIGNER(50004, "当前没有可用的面签员"),
    SIGN_ORDER_APPROVED(50005, "该面签订单已被审核，请选择其他订单"),
    SIGN_ORDER_PLACEHOLDER(50006, "有其他用户正在审核该订单，请选择其他订单"),
    SIGN_BANK_CALLED(50007, "您当前正在被呼叫，请稍后再试"),
    SIGN_PLACEHOLDER(50008, "面签单已被占位，请选择其他订单"),
    SIGN_CUSTOMER_OFF(50009, "当前客户已离线，请选择其他订单"),
    SIGN_CUSTOMER_BUSY(50010, "当前客户正在通话中，请选择其他订单"),
    SIGN_CUSTOMER_CALL(50011, "当前客户已离线，请选择其他订单"),
    SIGN_CUSTOMER_CALLED(50012, "当前客户正在通话中，请选择其他订单"),
    SIGN_CLIENT_CALLED(50013, "您当前正在被呼叫，请稍后再试"),
    SIGN_VIDEO_NOT_EXIST(50014, "未找到此次通话"),
    SIGN_BANK_ILLEGAL(50015, "当前请求用户非法"),

    EXCEL_PARSE_ERROR(60001, "excel文件解析失败"),
    EXCEL_DATA_PARSE_ERROR(60002, "excel文件数据解析失败"),
    EXCEL_DATA_CARD_ERROR(60003, "身份证号非法"),
    EXCEL_DATA_RESULT_ILLEGAL(60004, "导入结果非法"),

    FACE_ID_ERROR(90001, "FaceID调用异常"),
    API_DUPLICATE_ACCESS(99998, "请勿重复操作"),
    SERVER_ERROR(99999, "系统服务异常"),
    ;


    private Integer code;
    private String message;

    ResponseCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
