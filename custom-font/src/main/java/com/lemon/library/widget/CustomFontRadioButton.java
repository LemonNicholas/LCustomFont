package com.lemon.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class CustomFontRadioButton extends RadioButton {
    CustomFontTextView customFontTextView;

    public CustomFontRadioButton(Context context) {
        super(context);
        customFontTextView = new CustomFontTextView(context);
        customFontTextView.init(this, null, 0);
    }

    public CustomFontRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        customFontTextView = new CustomFontTextView(context, attrs);
        customFontTextView.init(this, attrs, 0);
    }

    public CustomFontRadioButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        customFontTextView = new CustomFontTextView(context, attrs, defStyle);
        customFontTextView.init(this, attrs, defStyle);
    }
}
