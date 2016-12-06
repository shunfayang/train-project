package com.moose.reviewdemo.dagger_module;

import com.moose.reviewdemo.contract.TestContract;
import com.moose.reviewdemo.domain.UserBean;
import com.moose.reviewdemo.model.TestModel;
import com.moose.reviewdemo.presenter.TestPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yangshunfa on 2016/12/6.
 * tips:
 */
@Module
public class TestModule {
    private final TestContract.View mView;

    public TestModule(TestContract.View mView) {
        this.mView = mView;
    }

    @Provides
    public TestContract.Model creatModel() {
        return new TestModel();
    }

    @Provides
    public UserBean createUserBean() {
        UserBean bean = new UserBean();
        bean.setName("zhangsan");
        bean.setHight("178cm");
        bean.setAge(18);
        return bean;
    }

    @Provides
    public TestContract.View creatView() {
        return this.mView;
    }

    @Provides
    public TestPresenter createPresenter(
            TestContract.Model model, TestContract.View view, UserBean bean) {
        return new TestPresenter(model, view, bean);
    }
}
