package com.example.administrator.oschina20180103.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina20180103.common.Helper;

/**
 * Created by Administrator on 2018/1/7.
 */

public class PageWechatMoment {
    private Helper helper;
    public PageWechatMoment(Helper helper){
        this.helper=helper;
    }
    public UiObject2 getContentEditText(){
        return helper.findById("com.tencent.mm:id/d5v");
    }
    public void setMomentContent(String content){
         helper.enterText(getContentEditText(),content);
    }
}
