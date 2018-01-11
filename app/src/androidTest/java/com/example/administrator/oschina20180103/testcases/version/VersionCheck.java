package com.example.administrator.oschina20180103.testcases.version;

import com.example.administrator.oschina20180103.common.BasicTestCase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2018/1/7.
 */

public class VersionCheck extends BasicTestCase{
    @Test
    public void name() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMy().clickSettingsIcon();
        pm.getPageSettings().clickAboutTv();
        String actualVersion=pm.getPageAbout().getCurrentVersion();
        String expectVersion="v4.0.0";
        Assert.assertTrue(actualVersion.startsWith(expectVersion));
    }
}
