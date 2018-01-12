package com.example.administrator.oschina20180103.testcases.news;

import com.example.administrator.oschina20180103.common.BasicTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2018/1/7.
 */

public class ShareToWechat extends BasicTestCase{
    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickLoginIcon();
        pm.getPageLogin().login("735723619@qq.com","12345678");
        pm.getPageCommon().goToHomeTab();
        pm.getPageHome().clickNewsItem(3);
        pm.getPageNewsDetail().clicktShareBtn();
        pm.getPageNewsDetail().shareToWechatMoment();
        pm.getPageWechatMoment().setMomentContent("这是开源中国");
    }
}
