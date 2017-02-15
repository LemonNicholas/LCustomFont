package com.lemon.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class CustomFontButton extends Button {
    CustomFontTextView customFontTextView;

    public CustomFontButton(Context context) {
        super(context);
        customFontTextView = new CustomFontTextView(context);
        customFontTextView.init(this,null, 0);
    }

    public CustomFontButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        customFontTextView = new CustomFontTextView(context, attrs);
        customFontTextView.init(this,attrs, 0);
    }

    public CustomFontButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        customFontTextView = new CustomFontTextView(context, attrs, defStyle);
        customFontTextView.init(this,attrs, defStyle);
    }
}
