package com.ross.pojo;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private Integer rzId;

    private String rzName;

    private String rzSex;

    private String rzAge;

    private String rzBirthday;

    private static final long serialVersionUID = 1L;

    public UserInfo(Integer rzId, String rzName, String rzSex, String rzAge, String rzBirthday) {
        this.rzId = rzId;
        this.rzName = rzName;
        this.rzSex = rzSex;
        this.rzAge = rzAge;
        this.rzBirthday = rzBirthday;
    }

    public UserInfo() {
        super();
    }

    public Integer getRzId() {
        return rzId;
    }

    public void setRzId(Integer rzId) {
        this.rzId = rzId;
    }

    public String getRzName() {
        return rzName;
    }

    public void setRzName(String rzName) {
        this.rzName = rzName == null ? null : rzName.trim();
    }

    public String getRzSex() {
        return rzSex;
    }

    public void setRzSex(String rzSex) {
        this.rzSex = rzSex == null ? null : rzSex.trim();
    }

    public String getRzAge() {
        return rzAge;
    }

    public void setRzAge(String rzAge) {
        this.rzAge = rzAge == null ? null : rzAge.trim();
    }

    public String getRzBirthday() {
        return rzBirthday;
    }

    public void setRzBirthday(String rzBirthday) {
        this.rzBirthday = rzBirthday == null ? null : rzBirthday.trim();
    }
}