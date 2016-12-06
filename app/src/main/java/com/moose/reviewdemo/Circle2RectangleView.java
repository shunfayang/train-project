package com.moose.reviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DrawFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Moose Yang on 2016/11/30.
 * tips:
 *
 */

public class Circle2RectangleView extends View {

    private Paint paint;
    private Thread thread;
    private Thread retangle2Circle;
    private boolean type = true;
    private long SLEEP_MILLIONS = 100;

    public Circle2RectangleView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.paint = new Paint();
        Paint paint = this.paint;
        paint.setColor(Color.RED);

    }

    public Circle2RectangleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Circle2RectangleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private float round = 100;
    private float right = 200;
    private float top = 0;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 1. 绘制圆角矩形成圆形

        RectF rec = new RectF(top, top, right, right);
        canvas.drawRoundRect(rec, round, round, paint);
        DrawFilter filter = new PaintFlagsDrawFilter(1,1);
        canvas.setDrawFilter(filter);
    }

    public void vary() {
        if(type){
            type = false;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        if (round <= 5 ) {
                            break;
                        }
                        round -= 1;
                        right -= 0.5;
                        top += 0.5;
                        try {
                            Thread.sleep(SLEEP_MILLIONS);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        postInvalidate();
                    }
                }
            }).start();
        }else{
            type = true;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        if (round >= 100 && type) {
                            break;
                        }
                        round += 1;
                        right += 0.5;
                        top -= 0.5;
                        try {
                            Thread.sleep(SLEEP_MILLIONS);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        postInvalidate();
                    }
                }
            }).start();
        }
    }

}
