package com.example.yumapp;

import android.content.Context;
import com.umeng.message.UmengNotificationClickHandler;
import com.umeng.message.entity.UMessage;

/**
 * description: 友盟消息回掉类 点击执行
 *
 * @author : yinzeyu
 * @date : 2018/8/28  20:13 创建
 */

public class NotificationClickHandler extends UmengNotificationClickHandler {

  @Override
  public void dealWithCustomAction(Context context, UMessage uMessage) {
    String msg = uMessage.custom;

  }
}
