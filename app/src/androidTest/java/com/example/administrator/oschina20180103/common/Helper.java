package com.example.administrator.oschina20180103.common;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.widget.EditText;

/**
 * Created by Administrator on 2018/1/3.
 */

public class Helper {
    private UiDevice device;
    private final long DEFAULT_TIME=5000;
    public Helper(UiDevice device){
        this.device=device;
    }
    public UiObject2 findById(String  id){
        device.wait(Until.hasObject(By.res(id)),DEFAULT_TIME);
        return device.findObject(By.res(id));
    }
    public UiObject2 findById(String id,int index){
        device.wait(Until.hasObject(By.res(id)),DEFAULT_TIME);
        return device.findObjects(By.res(id)).get(index-1);
    }
    public UiObject2 findByText(String text){
        device.wait(Until.hasObject(By.text(text)),DEFAULT_TIME);
        return device.findObject(By.text(text));
    }
    public UiObject2 findByText(String text,int index){
        device.wait(Until.hasObject(By.text(text)),DEFAULT_TIME);
        return device.findObjects(By.text(text)).get(index-1);
    }
    public UiObject2 findByContentDesc(String contentDesc){
        device.wait(Until.hasObject(By.desc(contentDesc)),DEFAULT_TIME);
        return device.findObject(By.desc(contentDesc));
    }
    public void click(UiObject2 obj){
        System.out.println("点击控件："+obj.getText());
        obj.click();
    }
    public void enterText(UiObject2 editText,String text){
        System.out.println("往输入框输入文本："+text);
        editText.setText(text);
    }
    public void clearEditText(UiObject2 editText){
        editText.clear();
    }
    public String getTextOfTextView(UiObject2 textView){
        return textView.getText();
    }

}
