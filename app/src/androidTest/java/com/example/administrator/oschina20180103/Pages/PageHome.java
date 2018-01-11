package com.example.administrator.oschina20180103.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina20180103.common.Helper;

/**
 * Created by Administrator on 2018/1/7.
 */

public class PageHome {
    private Helper helper;
    public PageHome(Helper helper){
    }
    public UiObject2 getNewsItem(int index){
        return helper.findById("net.oschina.app:id/tv_title",index);
    }
    public void clickNewsItem(int index){
        helper.click(getNewsItem(index));
    }
//    public UiObject2 getNewsItem(){
//        return helper.findByText("如何解决高并发问题");
//    }
//    public void clickNewsItem(){
//        helper.click(getNewsItem());
//    }
}
