package com.lemon.customfont;

import android.app.Application;

import com.lemon.library.CustomFontConfiguration;
import com.lemon.library.CustomFontEngine;

import java.util.HashMap;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        HashMap<Integer, String> fontTypeMap = new HashMap<>();
        // 1st param = your attrs.xml under declare-styleable attr enum value
        // 2nd param = your attrs.xml under declare-styleable attr enum name
        fontTypeMap.put(1, "fonts/SanFranciscoText-Regular.otf");
        fontTypeMap.put(2, "fonts/SanFranciscoText-Medium.otf");
        fontTypeMap.put(3, "fonts/SanFranciscoText-Bold.otf");
        CustomFontConfiguration customFontConfiguration = new CustomFontConfiguration.Builder()
                .setResourceDeclareStyleableName(R.styleable.font) // your attrs.xml declare-styleable name
                .setResourceAttr(R.styleable.font_type) // your attrs.xml under declare-styleable attr name
                .setFontTypeMap(fontTypeMap)
                .build();
        CustomFontEngine.setConfiguration(customFontConfiguration);

    }
}
