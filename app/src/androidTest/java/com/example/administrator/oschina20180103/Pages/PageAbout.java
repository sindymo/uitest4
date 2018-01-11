package com.example.administrator.oschina20180103.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina20180103.common.Helper;

/**
 * Created by Administrator on 2018/1/7.
 */

public class PageAbout {
    private Helper helper;
    public PageAbout(Helper helper){
        this.helper=helper;
    }

    public UiObject2 getBackBtn(){
        return helper.findByContentDesc("转到上一层级");
    }
    public UiObject2 getVersionTv(){
        return helper.findById("net.oschina.app:id/tv_version_name");
    }
    public String getCurrentVersion(){
        return helper.getTextOfTextView(getVersionTv());
    }
    public void clickBackBtn(){
        helper.click(getBackBtn());
    }
}
