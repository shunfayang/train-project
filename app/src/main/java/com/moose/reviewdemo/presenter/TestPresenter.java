package com.moose.reviewdemo.presenter;

import com.moose.reviewdemo.contract.TestContract;
import com.moose.reviewdemo.domain.UserBean;

/**
 * Created by yangshunfa on 2016/12/6.
 * tips:
 */

public class TestPresenter {
    public TestContract.Model mModel;
    public TestContract.View mView;
    public UserBean mUserBean;

    public TestPresenter(TestContract.Model mModel, TestContract.View mView, UserBean bean) {
        this.mUserBean = bean;
        this.mModel = mModel;
        this.mView = mView;
    }

    public void load() {

    }
}
