package com.moose.reviewdemo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.moose.reviewdemo.Circle2RectangleView;
import com.moose.reviewdemo.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Circle2RectangleView vary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        findViewById(R.id.moose_btn_databinding_activity).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(MainActivity.this, DatabindingActivity.class));
//            }
//        });
        vary = (Circle2RectangleView) findViewById(R.id.moose_vary);

    }

    @OnClick(R.id.moose_btn_start_service_activity)
    public void startServiceActivity(){
        startActivity(new Intent(this, ServiceDemoActivity.class));
    }
    @OnClick(R.id.moose_btn_databinding_activity)
    public void startDatabinding(){
        startActivity(new Intent(this, DatabindingActivity.class));
    }

    public void vary(View view){
        vary.vary();
    }
}
