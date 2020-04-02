package com.ross.pojo;

import java.io.Serializable;

public class Role implements Serializable {
    private Integer id;
    //角色
    private String role;
    //角色说明
    private String description;

    private static final long serialVersionUID = 1L;

    public Role(Integer id, String role, String description) {
        this.id = id;
        this.role = role;
        this.description = description;
    }

    public Role() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}