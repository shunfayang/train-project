package com.moose.reviewdemo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.moose.reviewdemo.R;
import com.moose.reviewdemo.contract.TestContract;
import com.moose.reviewdemo.dagger_component.DaggerTestComponent;
import com.moose.reviewdemo.dagger_component.TestComponent;
import com.moose.reviewdemo.dagger_module.TestModule;
import com.moose.reviewdemo.domain.UserBean;
import com.moose.reviewdemo.model.TestModel;
import com.moose.reviewdemo.presenter.TestPresenter;


public class TestActivity extends AppCompatActivity implements TestContract.View{

    private TestPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        UserBean bean = new UserBean();
        bean.setName("lisi");
        bean.setAge(18);
        bean.setHight("180cm");

        TestModel mModel = new TestModel();

        mPresenter = new TestPresenter(mModel, this, bean);
        TestComponent testComponent = DaggerTestComponent.builder().testModule(new TestModule(this)).build();
        TestPresenter inject = testComponent.inject();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.load();
    }

    @Override
    public void show() {

    }

    @Override
    public void dismiss() {

    }
}
