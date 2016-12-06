package com.moose.reviewdemo.dagger_component;

import com.moose.reviewdemo.activities.TestActivity;
import com.moose.reviewdemo.dagger_module.TestModule;
import com.moose.reviewdemo.presenter.TestPresenter;

import dagger.Component;

/**
 * Created by yangshunfa on 2016/12/6.
 * tips:
 */

@Component(modules = {TestModule.class})
public interface TestComponent {
    TestPresenter inject();
}
