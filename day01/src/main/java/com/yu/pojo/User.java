package com.yu.pojo;

/**
 * @author 小鱼
 * @version 1.0
 * @date 2020/11/18 11:51 下午
 */
public class User {
    private Integer id;
    private String lastName;
    private String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(Integer id, String lastName, String pwd) {
        this.id = id;
        this.lastName = lastName;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
