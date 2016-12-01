package com.moose.reviewdemo.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.moose.reviewdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ServiceDemoActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.moose_btn_start_service)
    Button mooseBtnStartService;
    @BindView(R.id.moose_btn_stop_service)
    Button mooseBtnStopService;
    @BindView(R.id.moose_btn_bind_service)
    Button mooseBtnBindService;
    @BindView(R.id.moose_btn_unbind_service)
    Button mooseBtnUnbindService;
    @BindView(R.id.activity_main)
    LinearLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_demo);
        ButterKnife.bind(this);
        mooseBtnStartService.setOnClickListener(this);
        mooseBtnBindService.setOnClickListener(this);
        mooseBtnStopService.setOnClickListener(this);
        mooseBtnBindService.setOnClickListener(this);
        mooseBtnUnbindService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
