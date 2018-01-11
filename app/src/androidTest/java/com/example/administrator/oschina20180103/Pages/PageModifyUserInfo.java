package com.example.administrator.oschina20180103.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina20180103.common.Helper;

/**
 * Created by Administrator on 2018/1/6.
 */

public class PageModifyUserInfo {
    private Helper helper;
    public PageModifyUserInfo (Helper helper){
        this.helper=helper;
    }
    public UiObject2 getUserNameEditText(){
        return helper.findById("net.oschina.app:id/et_data");
    }
    public UiObject2 getSaveBtn(){
        return helper.findById("net.oschina.app:id/menu_commit");
    }

    public void changeUserName(String name){
        helper.clearEditText(getUserNameEditText());
        helper.enterText(getUserNameEditText(),name);
    }
    public void clickSaveBtn(){
        helper.click(getSaveBtn());
    }



}
