package com.example.uas_ppapb_no1_yahya;


import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;

public class CustomButton  extends AppCompatButton {
    private static final int DEFAULT_COLOR = R.color.green;
    private static final int PRESSED_COLOR = R.color.yellow;

    private boolean isClicked = false;

    public CustomButton(Context context) {
        super(context);
        init();
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        // Set the default background color
        setBackgroundColor(getResources().getColor(DEFAULT_COLOR));
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked) {
                    setBackgroundColor(getResources().getColor(PRESSED_COLOR));
                    isClicked = true;
                }else {
                    setBackgroundColor(getResources().getColor(DEFAULT_COLOR));
                    isClicked = false;
                }
            }
        });
    }
}

