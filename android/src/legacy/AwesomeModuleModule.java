package com.reactnativeawesomemodule;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class AwesomeModuleModule extends ReactContextBaseJavaModule {
  public static final String NAME = AwesomeModuleModuleImpl.NAME;

  AwesomeModuleModule(ReactApplicationContext context) {
    super(context);
  }

  @Override
  @NonNull
  public String getName() {
    return AwesomeModuleModuleImpl.NAME;
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    AwesomeModuleModuleImpl.multiply(a, b, promise);
  }
}
