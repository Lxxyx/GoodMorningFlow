package com.goodmorningflow;

import android.app.Application;

import com.facebook.react.ReactApplication;

import cn.jiguang.share.android.api.JShareInterface;
import cn.jiguang.share.reactnative.JSharePackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  // 是否关闭 Log，默认不关闭
  private static boolean SHUTDOWN_LOG = false;
  // 是否关闭 toast，默认不关闭
  private static boolean SHUTDOWN_TOAST = false;

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new JSharePackage(SHUTDOWN_LOG, SHUTDOWN_TOAST)
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
    JShareInterface.init(this);
  }
}
