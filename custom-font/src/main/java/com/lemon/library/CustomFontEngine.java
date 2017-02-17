package com.lemon.library;

/**
 * Created by NicholasTan on 15/02/2017.
 */

public class CustomFontEngine {

    private static CustomFontConfiguration mConfiguration = new CustomFontConfiguration.Builder().build();

    public static void setConfiguration(CustomFontConfiguration configuration) {
        mConfiguration = configuration;
    }

    public static CustomFontConfiguration getConfiguration() {
        return mConfiguration;
    }
}
