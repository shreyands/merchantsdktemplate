package com.yourappname; // replace com.yourappname with your app’s name

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import com.ds.merchant.MerchantAcquisition;
import java.util.HashMap;



public class CallSdkModule extends ReactContextBaseJavaModule{
    CallSdkModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "CallSdkModule";
    }

    @ReactMethod
    public void call(){
        // call SDK method from here
        MerchantAcquisition.startApp(
                            getCurrentActivity(),
                            "API_KEY",
                            fieldAgent_id);
    }

}
