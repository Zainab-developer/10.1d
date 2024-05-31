package com.example.personalizedlearningexperienceapp;

import android.app.Application;

import com.paypal.checkout.PayPalCheckout;
import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.checkout.config.Environment;
import com.paypal.checkout.createorder.CurrencyCode;
import com.paypal.checkout.createorder.UserAction;
import com.paypal.pyplcheckout.BuildConfig;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PayPalCheckout.setConfig(new CheckoutConfig(
                this,
                "AZFI701N20iszlcNXu9pkZtrI_lWeZd8n2hZDL2JVZCwXJk7mqE1bYCjVC8dkFy95qBGKhg5NnyZ2jO9",
                Environment.SANDBOX,
                CurrencyCode.USD,
                UserAction.PAY_NOW,
                "com.example.personalizedlearningexperienceapp://paypalpay"
        ));
    }
}
