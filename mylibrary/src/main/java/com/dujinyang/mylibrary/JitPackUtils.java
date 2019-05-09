package com.dujinyang.mylibrary;

import android.util.Log;

import java.util.logging.Logger;

/***
 * 测试引用
 * @author dujinyang
 */
public class JitPackUtils {
    public static String TAG="TTEST";
    public JitPackUtils(){
        doPacking();
    }
    public void doPacking(){
        Log.i(TAG,"doPacking");
    }
    public void getVersion(){
        Log.i(TAG,"Version 1.0");
    }

    @androidx.annotation.NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
