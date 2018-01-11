package com.example.administrator.oschina20180103.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina20180103.common.Helper;

/**
 * Created by Administrator on 2018/1/3.
 */

public class PageCommon {
    private Helper helper;
    public PageCommon(Helper helper){
        this.helper=helper;
    }
    public UiObject2 getHomeTab(){
        return helper.findById("net.oschina.app:id/nav_item_news");
    }
    public UiObject2 getMomentTab(){
        return helper.findById("net.oschina.app:id/nav_item_tweet");
    }
    public UiObject2 getPublicBtn(){
        return helper.findById("net.oschina.app:id/nav_item_tweet_pub");
    }
    public UiObject2 getExploreTab(){
        return helper.findById("net.oschina.app:id/nav_item_explore");
    }
    public UiObject2 getMyTab(){
        return helper.findById("net.oschina.app:id/nav_item_me");
    }
    public void goToHomeTab(){
        helper.click(getHomeTab());
    }
    public void goToMomentTab(){
        helper.click(getMomentTab());
    }
    public void goToPublicBtn(){
        helper.click(getPublicBtn());
    }
    public void goToExploreTab(){
        helper.click(getExploreTab());
    }
    public void goToMyTab(){
        helper.click(getMyTab());
    }

}
