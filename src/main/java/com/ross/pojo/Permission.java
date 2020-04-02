package com.ross.pojo;

import java.io.Serializable;

/**
 * @author zjf
 */
public class Permission implements Serializable {
    private Integer id;
    //资源URL
    private String url;
    //所属角色编号
    private Integer roleid;
    //权限说明
    private String description;

    private static final long serialVersionUID = 1L;

    public Permission(Integer id, String url, Integer roleid, String description) {
        this.id = id;
        this.url = url;
        this.roleid = roleid;
        this.description = description;
    }

    public Permission() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}