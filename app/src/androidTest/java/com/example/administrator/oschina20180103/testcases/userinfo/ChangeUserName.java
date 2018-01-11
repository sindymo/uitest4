package com.example.administrator.oschina20180103.testcases.userinfo;

import com.example.administrator.oschina20180103.common.BasicTestCase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2018/1/6.
 */

public class ChangeUserName extends BasicTestCase{
    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickLoginIcon();
        pm.getPageLogin().login("735723619@qq.com","12345678");
        pm.getPageMy().clickNickName();
        pm.getPageMyData().clickNickNameTv();
        pm.getPageModifyUserInfo().changeUserName("auto12345auto");
        pm.getPageModifyUserInfo().clickSaveBtn();
        pm.getPageMyData().clickBackBtn();
        pm.getPageMy().clickSettingsIcon();
        pm.getPageSettings().clickLoginOutTv();
        pm.getPageSettings().clickBackBtn();
        pm.getPageMy().clickLoginIcon();
        pm.getPageLogin().login("735723619@qq.com","12345678");
        Assert.assertEquals("auto12345auto",pm.getPageMy().getNickName());
    }
}
