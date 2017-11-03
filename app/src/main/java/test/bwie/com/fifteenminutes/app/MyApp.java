package test.bwie.com.fifteenminutes.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * 类的用途：
 *
 * @author HP
 * @date 2017/11/3 15 34
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
