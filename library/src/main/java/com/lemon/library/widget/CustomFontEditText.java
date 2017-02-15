package com.lemon.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomFontEditText extends EditText {
    CustomFontTextView customFontTextView;

    public CustomFontEditText(Context context) {
        super(context);
        customFontTextView = new CustomFontTextView(context);
        customFontTextView.init(this, null, 0);
    }

    public CustomFontEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        customFontTextView = new CustomFontTextView(context, attrs);
        customFontTextView.init(this, attrs, 0);
    }

    public CustomFontEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        customFontTextView = new CustomFontTextView(context, attrs, defStyle);
        customFontTextView.init(this, attrs, defStyle);
    }
}
