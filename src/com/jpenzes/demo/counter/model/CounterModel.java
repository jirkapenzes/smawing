package com.jpenzes.demo.counter.model;

import com.jpenzes.smawing.SModel;

/**
 * Author: Jirka Penzes
 * Date: 25/03/14 11:53
 */
public class CounterModel extends SModel {

    private int currentCounterValue;

    public CounterModel() {
        currentCounterValue = 0;
    }

    public int getCurrentCounterValue() {
        return currentCounterValue;
    }

    public void setCurrentCounterValue(int currentCounterValue) {
        this.currentCounterValue = currentCounterValue;
        requestNotify();
    }
}
