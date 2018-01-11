package com.example.administrator.oschina20180103.Pages;

import com.example.administrator.oschina20180103.common.Helper;

/**
 * Created by Administrator on 2018/1/5.
 */

public class PageManager {
    private Helper helper;
    private PageCommon pageCommon;
    private PageLogin pageLogin;
    private PageMy pageMy;
    private PageMyData pageMyData;
    private PageModifyUserInfo pageModifyUserInfo;
    private PageSettings pageSettings;
    private PageAbout pageAbout;
    private PageHome pageHome;
    private PageNewsDetail pageNewsDetail;
    private PageFavorites pageFavorites;
    private PageWechatMoment pageWechatMoment;

    public PageManager(Helper helper) {
        this.helper=helper;
    }
    public PageCommon getPageCommon(){
        if (pageCommon==null){
            pageCommon=new PageCommon(helper);
        }
        return pageCommon;
    }
    public PageLogin getPageLogin(){
        if (pageLogin==null){
            pageLogin=new PageLogin(helper);
        }
        return pageLogin;
    }
    public PageMy getPageMy(){
        if (pageMy==null){
            pageMy=new PageMy(helper);
        }
        return pageMy;
    }
    public PageMyData getPageMyData(){
        if (pageMyData==null){
            pageMyData=new PageMyData(helper);
        }
        return pageMyData;
    }
    public PageModifyUserInfo getPageModifyUserInfo(){
        if (pageModifyUserInfo==null){
            pageModifyUserInfo=new PageModifyUserInfo(helper);
        }
        return pageModifyUserInfo;
    }
    public PageSettings getPageSettings(){
        if (pageSettings==null){
            pageSettings=new PageSettings(helper);
        }
        return pageSettings;
    }
    public PageAbout getPageAbout(){
        if (pageAbout==null){
            pageAbout=new PageAbout(helper);
        }
        return pageAbout;
    }
    public PageHome getPageHome(){
        if (pageHome==null){
            pageHome=new PageHome(helper);
        }
        return pageHome;
    }
    public PageNewsDetail getPageNewsDetail(){
        if (pageNewsDetail==null){
            pageNewsDetail=new PageNewsDetail(helper);
        }
        return pageNewsDetail;
    }
    public PageFavorites getPageFavorites(){
        if (pageFavorites==null){
            pageFavorites=new PageFavorites(helper);
        }
        return pageFavorites;
    }
    public PageWechatMoment getPageWechatMoment(){
        if (pageWechatMoment==null){
            pageWechatMoment=new PageWechatMoment(helper);
        }
        return pageWechatMoment;
    }

}