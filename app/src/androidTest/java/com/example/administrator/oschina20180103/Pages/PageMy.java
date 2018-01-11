package com.example.administrator.oschina20180103.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina20180103.common.Helper;

/**
 * Created by Administrator on 2018/1/5.
 */

public class PageMy {
    private Helper helper;
    public PageMy(Helper helper){
        this.helper=helper;
    }
    public UiObject2 getLoginIcon(){
        return helper.findById("net.oschina.app:id/iv_portrait");
    }
    public UiObject2 getSettingsIcon(){ return helper.findById("net.oschina.app:id/iv_logo_setting");}
    public UiObject2 getFavorites(){
        return helper.findById("net.oschina.app:id/ly_favorite");
    }
    public UiObject2 getMyMsg(){
        return helper.findById("net.oschina.app:id/rl_message");
    }
    public UiObject2 getReadItem(){
        return helper.findById("net.oschina.app:id/rl_read");
    }
    public UiObject2 getMyBlogItem(){
        return helper.findById("net.oschina.app:id/rl_blog");
    }
    public UiObject2 getMyQAItem(){
        return helper.findById("net.oschina.app:id/rl_info_question");
    }
    public UiObject2 getMyActvityItem(){
        return helper.findById("net.oschina.app:id/rl_info_activities");
    }
    public UiObject2 getMyTeamItem(){
        return helper.findById("net.oschina.app:id/rl_team");
    }
    public UiObject2 getShareItem(){
        return helper.findById("net.oschina.app:id/rl_share");
    }
    public UiObject2 getNickNameTv(){
        return helper.findById("net.oschina.app:id/tv_nick");
    }
    /**
     *
     */
    public void clickLoginIcon(){
        helper.click(getLoginIcon());
    }
    public void clickSettingsIcon(){
        helper.click(getSettingsIcon());
    }
    public void clickFavorites(){
        helper.click(getFavorites());
    }
    public void clickMyMsg(){
        helper.click(getMyMsg());
    }
    public void clickReadItem(){
        helper.click(getReadItem());
    }
    public void clickMyBlogItem(){
        helper.click(getMyBlogItem());
    }
    public void clickMyQAItem(){
        helper.click(getMyQAItem());
    }
    public void clickMyActvityItem(){
        helper.click(getMyActvityItem());
    }
    public void clickMyTeamItem(){
        helper.click(getMyTeamItem());
    }
    public void clickShareItem(){
        helper.click(getShareItem());
    }
    public void clickNickName(){
        helper.click(getNickNameTv());
    }
    public String getNickName(){
        return helper.getTextOfTextView(getNickNameTv());
    }
}
