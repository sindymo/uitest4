package com.example.administrator.oschina20180103.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina20180103.common.Helper;

/**
 * Created by Administrator on 2018/1/7.
 */

public class PageFavorites {
    private Helper helper;
    public PageFavorites(Helper helper){
        this.helper=helper;
    }
    public UiObject2 getBackBtn(){
        return helper.findByContentDesc("转到上一层级");
    }
    public UiObject2 getNewsTitle(int index){
        return helper.findById("net.oschina.app:id/tv_title",index);
    }

    /**
     *
     */
    public void clickBackBtn(){
        helper.click(getBackBtn());
    }
    public String getNewsTitleValue(int index){
        return helper.getTextOfTextView(getNewsTitle(index));
    }


}
