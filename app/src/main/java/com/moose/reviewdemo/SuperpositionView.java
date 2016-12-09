package com.moose.reviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by yangshunfa on 2016/12/8.
 * tips:
 */

public class SuperpositionView extends LinearLayout {

    private TextView aboveView;
    private TextView belowView;
    /** 全局颜色 */
    private int mColor = 0xfffe2142;

    public SuperpositionView(Context context) {
        super(context);
        init(context);
    }

    public SuperpositionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public SuperpositionView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        // 默认Vertical排列
        this.setOrientation(LinearLayout.VERTICAL);

        // 顺序排列三个成员：TextView TextView |向下图标
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, 0);
        params.weight = 1;
        this.setPadding(0, 0, 0 , 10);

        // TextView1
        aboveView = new TextView(context);
        aboveView.setGravity(Gravity.CENTER);
        aboveView.setText("默认");
        this.addView(aboveView, params);
        // TextView2

        belowView = new TextView(context);
        belowView.setGravity(Gravity.CENTER);
        belowView.setText("默认");
        this.addView(belowView, params);
        LayoutParams triangleViewParams = new LayoutParams(LayoutParams.MATCH_PARENT,
                (int)context.getResources().getDimension(R.dimen.triangle_view_height));
        TriangleView triangleView = new TriangleView(context);
        this.addView(triangleView, triangleViewParams);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }

    /**
     * 设置上面的文字
     * @param text
     */
    public void setAboveViewText(CharSequence text){
        this.aboveView.setText(text);
    }
    public void setAboveViewText(int resid){
        this.aboveView.setText(resid);
    }

    /**
     * 设置下面的文字
     * @param text
     */
    public void setBelowViewText(CharSequence text){
        this.belowView.setText(text);
    }
    public void setBelowViewText(int resid){
        this.belowView.setText(resid);
    }

    public void setSelectorColor(int color){
        this.mColor = color;
    }
}
