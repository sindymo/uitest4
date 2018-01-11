package com.example.administrator.oschina20180103.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina20180103.common.Helper;

import java.util.logging.Handler;

/**
 * Created by Administrator on 2018/1/7.
 */

public class PageNewsDetail {
    private Helper helper;
    public PageNewsDetail(Helper helper){
        this.helper=helper;
    }
    public UiObject2 getBackBtn(){
        return helper.findByContentDesc("转到上一层级");
    }
    public UiObject2 getNewsTitle(){
        return helper.findById("net.oschina.app:id/tv_title");
    }
    public UiObject2 getAddToFavoritesBtn(){
        return helper.findById("net.oschina.app:id/ib_fav");
    }
    public UiObject2 getShareBtn(){
        return helper.findById("net.oschina.app:id/menu_share");
    }
    public UiObject2 getWechatMoment(){
        return helper.findByText("朋友圈");
    }
    /**
     *
     */
    public void clickBackBtn(){
        helper.click(getBackBtn());
    }
    public void clickNewsTitle(){
        helper.click(getNewsTitle());
    }
    public void clickAddToFavoritesBtn(){
        helper.click(getAddToFavoritesBtn());
    }
    public void clicktShareBtn(){
        helper.click(getShareBtn());
    }
    public String getNewsTitleValue(){
        return helper.getTextOfTextView(getNewsTitle());
    }
    public void shareToWechatMoment(){
        helper.click(getWechatMoment());
    }
}
