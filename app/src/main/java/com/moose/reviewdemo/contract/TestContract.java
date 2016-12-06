package com.moose.reviewdemo.contract;

/**
 * Created by yangshunfa on 2016/12/6.
 * tips:
 */

public interface TestContract {
    interface Model {
        String loadData();
        void update(String msg);
    }
    interface View {
        void show();
        void dismiss();
    }
}
