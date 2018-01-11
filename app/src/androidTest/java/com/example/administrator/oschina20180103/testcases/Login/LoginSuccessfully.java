package com.example.administrator.oschina20180103.testcases.Login;

import com.example.administrator.oschina20180103.common.BasicTestCase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2018/1/5.
 */

public class LoginSuccessfully extends BasicTestCase{
    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickLoginIcon();
//        pm.getPageLogin().clickName();
       pm.getPageLogin().login("735723619@qq.com","12345678");
//        pm.getPageLogin().clearName();
//        pm.getPageLogin().enterName("735723619@qq.com");
//        pm.getPageLogin().clickPwd();
//        pm.getPageLogin().clearPwd();
//        pm.getPageLogin().enterPwd("12345678");
        pm.getPageLogin().clickLoginBtn();
        Assert.assertEquals("aotu12345aotu",pm.getPageMy().getNickName());
    }
}

