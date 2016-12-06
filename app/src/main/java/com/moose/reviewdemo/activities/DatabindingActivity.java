package com.moose.reviewdemo.activities;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.moose.reviewdemo.R;
import com.moose.reviewdemo.bean.User;
//import com.moose.reviewdemo.databinding.CustomActivityBinding;

import org.jetbrains.annotations.NotNull;

public class DatabindingActivity extends AppCompatActivity {
//    private static Handler mHandler = new Handler();
//    private CustomActivityBinding viewDataBinding;
//    private User user;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.custom_activity);
//
//        user = new User();
//        user.setName("zhan");
//        user.setPassword("sjxiaojidfjoselw");
//
//        mHandler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                viewDataBinding.setUser(user);
//            }
//        }, 3000);
//        viewDataBinding.mooseBtnToast.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String text = viewDataBinding.mooseBtnName.getText().toString();
////                showToast(null);
////                viewDataBinding.mooseBtnName.setText("张");
//                TextView textView = new TextView(DatabindingActivity.this);
//                textView.setText(viewDataBinding.mooseBtnName.getText().toString()
//                        + " : "
//                        + viewDataBinding.mooseBtnPassword.getText().toString());
//
//                viewDataBinding.mooseLlTextcontainer.addView(textView);
//            }
//        });
//    }

    private void showToast(@NotNull String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
