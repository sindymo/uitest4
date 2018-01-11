package com.example.administrator.oschina20180103.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina20180103.common.Helper;

/**
 * Created by Administrator on 2018/1/5.
 */

public class PageLogin {
    private Helper helper;
    public PageLogin(Helper helper){
        this.helper=helper;
    }
    public UiObject2 getBackBtn() {
        return helper.findById("net.oschina.app:id/ib_navigation_back");
    }

    public UiObject2 getNameET() {
        return helper.findById("net.oschina.app:id/ll_login_username");
    }

    public UiObject2 getPwdET() {
        return helper.findById("net.oschina.app:id/ll_login_pwd");
    }

    public UiObject2 getForgetPwdTv() {
        return helper.findById("net.oschina.app:id/tv_login_forget_pwd");
    }

    public UiObject2 getLoginBtn() {
        return helper.findById("net.oschina.app:id/bt_login_submit");
    }

    public UiObject2 getRegistBtn() {
        return helper.findById("net.oschina.app:id/bt_login_register");
    }

    public UiObject2 getPullBtn() {
        return helper.findById("net.oschina.app:id/ll_login_pull");
    }
    public UiObject2 getWebo(){
        return helper.findById("net.oschina.app:id/ib_login_weibo");
    }
    public UiObject2 getWx(){
        return helper.findById("net.oschina.app:id/ib_login_wx");
    }
    public UiObject2 getQQ(){
        return helper.findById("net.oschina.app:id/ib_login_qq");
    }
    public UiObject2 getCsdn(){
        return helper.findById("net.oschina.app:id/ib_login_csdn");
    }

    /**
     *
     */
    public void clickBackBtn() {
        helper.click(getBackBtn());
    }
    public void clickName(){
        helper.click(getNameET());
    }
    public void clickPwd(){
        helper.click(getPwdET());
    }

    public void enterName(String name){
        helper.enterText(getNameET(),name);
    }
    public void enterPwd(String pwd){
        helper.enterText(getPwdET(),pwd);
    }

    public void clickForgetPwdTv() {
        helper.click(getForgetPwdTv());
    }

    public void clickLoginBtn() {
        helper.click(getLoginBtn());
    }

    public void clickRegistBtn(){
        helper.click(getRegistBtn());
    }
    public void clickPullBtn(){
        helper.click(getPullBtn());
    }
    public void clickWebo(){
        helper.click(getWebo());
    }
    public void clickWx(){
        helper.click(getWx());
    }
    public void clickQQ(){
        helper.click(getQQ());
    }
    public void clickCsdn(){
        helper.click(getCsdn());
    }
    public void clearName(){
        helper.clearEditText(getNameET());
    }
    public void clearPwd(){
        helper.clearEditText(getPwdET());
    }
    public void login(String name,String pwd){
        clickName();
        clearName();
        enterName(name);
        clickPwd();
        clearPwd();
        enterPwd(pwd);
        clickLoginBtn();
    }
    public boolean isRegistBtnShow(){
        if (getRegistBtn()!=null){
            return true;
        }
        return false;
    }

}
