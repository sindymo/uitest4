package com.example.administrator.oschina20180103.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina20180103.common.Helper;

/**
 * Created by Administrator on 2018/1/6.
 */

public class PageSettings {
    private Helper helper;
    public PageSettings(Helper helper){
        this.helper=helper;
    }
    public UiObject2 getBackBtn(){
        return helper.findByContentDesc("转到上一层级");
    }
    public UiObject2 getFeedBackTv(){
        return helper.findById("net.oschina.app:id/rl_feedback");
    }
    public UiObject2 getAboutTv(){
        return helper.findById("net.oschina.app:id/rl_about");
    }
    public UiObject2 getLoginOutTv(){
        return helper.findById("net.oschina.app:id/rl_cancel");
    }
    /**
     *
     */
    public void clickFeedBackTv(){
        helper.click(getFeedBackTv());
    }
    public void clickAboutTv(){
        helper.click(getAboutTv());
    }
    public void clickLoginOutTv(){
        helper.click(getLoginOutTv());
    }
    public void clickBackBtn(){
        helper.click(getBackBtn());
    }
}
