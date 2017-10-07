package com.zackeryrobinson.zackscustomviews.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.constraint.solver.widgets.Rectangle;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Zack on 10/7/2017.
 */

public class CustomView extends View {

    private static final int SQUARE_SIZE = 200;

    private Rect mRectSquare;
    private Paint mPaintSquare;

    public CustomView(Context context) {
        super(context);
        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);

    }

    public void swapColor(){

        //if color is green, then new color should be red, or else it should be green
        mPaintSquare.setColor(mPaintSquare.getColor() == Color.GREEN ? Color.RED : Color.GREEN);
        postInvalidate();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);

    }

    public void init (@Nullable AttributeSet set){
        mRectSquare = new Rect();
        mPaintSquare = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaintSquare.setColor(Color.GREEN);

    }

    @Override
    protected void onDraw(Canvas canvas) {

        mRectSquare.left = 10;
        mRectSquare.top = 10;
        mRectSquare.right = mRectSquare.left+ SQUARE_SIZE;
        mRectSquare.bottom = mRectSquare.top+ SQUARE_SIZE;

        canvas.drawRect(mRectSquare, mPaintSquare);

    }
}
