package com.moose.reviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yangshunfa on 2016/12/8.
 * tips:
 */

public class TriangleView extends View {

    private int mColor = 0xfffe2142;
    public TriangleView(Context context) {
        super(context);
    }

    public TriangleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TriangleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        Path path = new Path();
        path.moveTo(width / 2 - 12, 0);
        path.lineTo(width / 2 + 12, 0);
        path.lineTo(width / 2, height);
        path.close();

        Paint paint = new Paint();
        paint.setColor(this.mColor);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.FILL);

        canvas.drawPath(path, paint);
    }
}
