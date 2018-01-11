package com.example.administrator.oschina20180103.testcases.Login;

import com.example.administrator.oschina20180103.common.BasicTestCase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2018/1/6.
 */

public class LoginFailed extends BasicTestCase{
    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickLoginIcon();
        pm.getPageLogin().login("735723619@qq.com","123456789");
        Assert.assertTrue(pm.getPageLogin().isRegistBtnShow());
    }
}
