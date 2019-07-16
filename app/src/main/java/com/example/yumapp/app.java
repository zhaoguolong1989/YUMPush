package com.example.yumapp;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;

import java.util.List;

import android.os.Process;

/**
 * description :
 *
 * @author : case
 * @date : 2019/2/19 15:44
 */
public class app extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PushModel.getPushModel().initUM(this, "5c6bb73bf1f55670510006d7", "3b4baef483e87c7794645583e54a6d1f", "111");
        PushModel.getPushModel().initMZPush(this, "", "");
        if (isMainProcess()) {
            PushModel.getPushModel().initMiPush(this, "", "");
            PushModel.getPushModel().initHWPush(this);
        }
        //  OPPO通道
        PushModel.getPushModel().initOppoPush(this, "", "");
        //  VIVO通道
        PushModel.getPushModel().initVivoPush(this);
    }

    /**
     * 是否主进程
     */
    private Boolean isMainProcess() {
        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        if (am.getRunningAppProcesses() == null) {
            return false;
        }
        List<ActivityManager.RunningAppProcessInfo> processInfo = am.getRunningAppProcesses();
        String mainProcessName = getPackageName();
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo info : processInfo) {
            if (info.pid == myPid && mainProcessName.equals(info.processName)) {
                return true;
            }
        }
        return false;
    }
}
