package com.lemon.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class CustomFontCheckBox extends CheckBox {
    CustomFontTextView customFontTextView;

    public CustomFontCheckBox(Context context) {
        super(context);
        customFontTextView = new CustomFontTextView(context);
        customFontTextView.init(this,null, 0);
    }

    public CustomFontCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        customFontTextView = new CustomFontTextView(context, attrs);
        customFontTextView.init(this,attrs, 0);
    }

    public CustomFontCheckBox(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        customFontTextView = new CustomFontTextView(context, attrs, defStyle);
        customFontTextView.init(this,attrs, defStyle);
    }
}
