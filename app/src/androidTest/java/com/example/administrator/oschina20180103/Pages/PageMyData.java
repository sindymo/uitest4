package com.example.administrator.oschina20180103.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina20180103.common.Helper;

/**
 * Created by Administrator on 2018/1/6.
 */

public class PageMyData {
    private Helper helper;
    public PageMyData(Helper helper){
        this.helper=helper;
    }
    public UiObject2 getBackBtn(){
        return helper.findByContentDesc("转到上一层级");
    }
    public UiObject2 getNickNameTv(){
        return helper.findById("net.oschina.app:id/ll_nickname");
    }
    /**
     *
     */
    public void clickBackBtn(){
        helper.click(getBackBtn());
    }
    public void clickNickNameTv(){
        helper.click(getNickNameTv());
    }
}
