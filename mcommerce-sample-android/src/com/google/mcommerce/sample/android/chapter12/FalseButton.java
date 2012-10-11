package com.google.mcommerce.sample.android.chapter12;

// This file is FalseButton.java
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

public class FalseButton extends Button {

	public FalseButton(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		String myTag = this.getTag().toString();
		Log.v(myTag, "-----------------------------------");
		Log.v(myTag, MainActivity.describeEvent(this, event));
		Log.v(myTag, "super onTouchEvent() returns " + super.onTouchEvent(event));
		Log.v(myTag, "and I'm returning false");
		return(false);
	}
}
