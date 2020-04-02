package com.ross.common;

import java.io.Serializable;

/**
 * @author
 * @version 1.0.1
 */
public class AppResult implements Serializable {
    private String id;      //请求成功后的编号，可以为空
    private Integer code;  //请求成功的状态码，不为空
    private String msg;     //请求后的响应说明文字，不为空
    private Long count;     //请求成功后总的数据条数，可以为空
    private Object data;    //请求成功后的返回数据，查询的时候不为空，添加编辑的时候可以为空

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
