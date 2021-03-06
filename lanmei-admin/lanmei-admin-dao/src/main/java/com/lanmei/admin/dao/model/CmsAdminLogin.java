package com.lanmei.admin.dao.model;

import java.util.Date;

public class CmsAdminLogin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin_login.login_id
     *
     * @mbggenerated
     */
    private Integer loginId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin_login.login_time
     *
     * @mbggenerated
     */
    private Date loginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin_login.login_ip
     *
     * @mbggenerated
     */
    private String loginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin_login.admin_id
     *
     * @mbggenerated
     */
    private Integer adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin_login.explorer
     *
     * @mbggenerated
     */
    private String explorer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin_login.login_id
     *
     * @return the value of cms_admin_login.login_id
     *
     * @mbggenerated
     */
    public Integer getLoginId() {
        return loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin_login.login_id
     *
     * @param loginId the value for cms_admin_login.login_id
     *
     * @mbggenerated
     */
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin_login.login_time
     *
     * @return the value of cms_admin_login.login_time
     *
     * @mbggenerated
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin_login.login_time
     *
     * @param loginTime the value for cms_admin_login.login_time
     *
     * @mbggenerated
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin_login.login_ip
     *
     * @return the value of cms_admin_login.login_ip
     *
     * @mbggenerated
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin_login.login_ip
     *
     * @param loginIp the value for cms_admin_login.login_ip
     *
     * @mbggenerated
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin_login.admin_id
     *
     * @return the value of cms_admin_login.admin_id
     *
     * @mbggenerated
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin_login.admin_id
     *
     * @param adminId the value for cms_admin_login.admin_id
     *
     * @mbggenerated
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin_login.explorer
     *
     * @return the value of cms_admin_login.explorer
     *
     * @mbggenerated
     */
    public String getExplorer() {
        return explorer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin_login.explorer
     *
     * @param explorer the value for cms_admin_login.explorer
     *
     * @mbggenerated
     */
    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }
}