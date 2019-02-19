package com.example.yumapp;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.umeng.message.meizu.UmengMeizuPushReceiver;

/**
 * AndroidApp
 * version
 *
 * @author INITIAL_D
 * @date 2018/4/12
 * <p>
 * 自定义Receiver组件受魅族接入方式限制，必须在包名目录实现一个自定义Recevier，继承自UmengMeizuPushReceiver
 */
public class MeiPushReceiver extends UmengMeizuPushReceiver {
  @Override
  public void onRegister(Context context, String s) {
    super.onRegister(context, s);
  }

  @Override
  public void onUnRegister(Context context, boolean b) {
    super.onUnRegister(context, b);
  }

  @Override
  public void onReceive(Context context, Intent intent) {
    super.onReceive(context, intent);
  }

  @Override
  public void onRegisterStatus(Context context, RegisterStatus registerStatus) {
    super.onRegisterStatus(context, registerStatus);
  }

  @Override
  public void onUnRegisterStatus(Context context, UnRegisterStatus unRegisterStatus) {
    super.onUnRegisterStatus(context, unRegisterStatus);
  }
}
