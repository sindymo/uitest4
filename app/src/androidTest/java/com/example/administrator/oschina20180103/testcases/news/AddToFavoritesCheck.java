package com.example.administrator.oschina20180103.testcases.news;

import com.example.administrator.oschina20180103.common.BasicTestCase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2018/1/7.
 */

public class AddToFavoritesCheck extends BasicTestCase{
    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickLoginIcon();
        pm.getPageLogin().login("735723619@qq.com","12345678");
        pm.getPageCommon().goToHomeTab();
        pm.getPageHome().clickNewsItem(3);
        //pm.getPageHome().clickNewsItem();
        pm.getPageNewsDetail().clickAddToFavoritesBtn();
        String newTitle=pm.getPageNewsDetail().getNewsTitleValue();
        pm.getPageNewsDetail().clickBackBtn();
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickFavorites();
        String actualNewsTile=pm.getPageFavorites().getNewsTitleValue(1);
        Assert.assertEquals(newTitle,actualNewsTile);
    }
}
