package com.example.administrator.oschina20180103.testcases.mysettings;

import com.example.administrator.oschina20180103.common.BasicTestCase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2018/1/6.
 */

public class LoginStatusCheck extends BasicTestCase{
    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickMyMsg();
        Assert.assertTrue(pm.getPageLogin().isRegistBtnShow());
        pm.getPageLogin().clickBackBtn();

        pm.getPageMy().clickReadItem();
        Assert.assertTrue(pm.getPageLogin().isRegistBtnShow());
        pm.getPageLogin().clickBackBtn();

        pm.getPageMy().clickMyBlogItem();
        Assert.assertTrue(pm.getPageLogin().isRegistBtnShow());
        pm.getPageLogin().clickBackBtn();

        pm.getPageMy().clickMyQAItem();
        Assert.assertTrue(pm.getPageLogin().isRegistBtnShow());
        pm.getPageLogin().clickBackBtn();

        pm.getPageMy().clickMyActvityItem();
        Assert.assertTrue(pm.getPageLogin().isRegistBtnShow());
        pm.getPageLogin().clickBackBtn();

        pm.getPageMy().clickMyTeamItem();
        Assert.assertTrue(pm.getPageLogin().isRegistBtnShow());
        pm.getPageLogin().clickBackBtn();

        pm.getPageMy().clickShareItem();
        Assert.assertTrue(pm.getPageLogin().isRegistBtnShow());
        pm.getPageLogin().clickBackBtn();
    }
}
