package com.lemon.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.lemon.library.CustomFontConfiguration;
import com.lemon.library.CustomFontEngine;

public class CustomFontTextView extends TextView {
    private Context mContext;
    private int defaultDimension = 0;
    private int fontType;

    public CustomFontTextView(Context context) {
        super(context);
        this.mContext = context;
        init(this, null, 0);
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        init(this, attrs, 0);
    }

    public CustomFontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.mContext = context;
        init(this, attrs, defStyle);
    }

    public void init(TextView textview, AttributeSet attrs, int defStyle) {
        CustomFontConfiguration customFontConfiguration = CustomFontEngine.getConfiguration();
        if (customFontConfiguration == null) {
            return;
        }
        if (customFontConfiguration.getResourceDeclareStyleableName() == null) {
            return;
        }

        final TypedArray a = getContext().obtainStyledAttributes(
                attrs, customFontConfiguration.getResourceDeclareStyleableName(), defStyle, 0);
        fontType = a.getInt(customFontConfiguration.getResourceAttr(), defaultDimension);
        a.recycle();
        if (customFontConfiguration.getFontTypeMap().get(fontType) != null) {
            textview.setTypeface(Typeface.createFromAsset(mContext.getAssets(), customFontConfiguration.getFontTypeMap().get(fontType)));
        }
    }

}
