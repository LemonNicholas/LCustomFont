package com.lemon.library;

import java.util.HashMap;

/**
 * Created by NicholasTan on 15/02/2017.
 */

public class CustomFontConfiguration {

    private int[] mResourceDeclareStyleableName;
    private int mResourceAttr = 0;
    private HashMap<Integer, String> mFontTypeMap = new HashMap<>();

    public CustomFontConfiguration(Builder builder) {
        this.mResourceDeclareStyleableName = builder.mResourceDeclareStyleableName;
        this.mResourceAttr = builder.mResourceAttr;
        this.mFontTypeMap = builder.mFontTypeMap;
    }

    public int[] getResourceDeclareStyleableName() {
        return mResourceDeclareStyleableName;
    }

    public int getResourceAttr() {
        return mResourceAttr;
    }

    public HashMap<Integer, String> getFontTypeMap() {
        return mFontTypeMap;
    }

    public static class Builder {
        private int[] mResourceDeclareStyleableName;
        private int mResourceAttr = 0;
        private HashMap<Integer, String> mFontTypeMap = new HashMap<>();

        public Builder() {
        }

        public Builder setResourceDeclareStyleableName(int[] resourceDeclareStyleableName) {
            mResourceDeclareStyleableName = resourceDeclareStyleableName;
            return this;
        }

        public Builder setResourceAttr(int resourceAttr) {
            mResourceAttr = resourceAttr;
            return this;
        }

        public Builder setFontTypeMap(HashMap<Integer, String> fontTypeMap) {
            mFontTypeMap = fontTypeMap;
            return this;
        }

        public CustomFontConfiguration build() {
            return new CustomFontConfiguration(this);
        }
    }
}
