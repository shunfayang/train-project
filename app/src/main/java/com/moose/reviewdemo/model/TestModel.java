package com.moose.reviewdemo.model;

import com.moose.reviewdemo.contract.TestContract;

/**
 * Created by yangshunfa on 2016/12/6.
 * tips:
 */

public class TestModel implements TestContract.Model {

    @Override
    public String loadData() {
        return null;
    }

    @Override
    public void update(String msg) {

    }
}
