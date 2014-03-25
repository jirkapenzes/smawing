package com.jpenzes.demo.counter.controller;

import com.jpenzes.demo.counter.model.CounterModel;
import com.jpenzes.demo.counter.view.CounterView;
import com.jpenzes.smawing.SController;
import com.jpenzes.smawing.SFrame;

/**
 * Author: Jirka Penzes
 * Date: 25/03/14 12:00
 */
public class CounterController extends SController<CounterView, CounterModel> {

    public CounterController(SFrame frame, Class<CounterView> view, Class<CounterModel> model) {
        super(frame, view, model);
    }

    @Override
    protected void initialize() {
        getModel().setCurrentCounterValue(0);
    }

    public void incrementCounterValue() {
        addCounterValue(+1);
    }

    public void decrementCounterValue() {
        addCounterValue(-1);
    }

    private void addCounterValue(int value) {
        int newValue = getModel().getCurrentCounterValue() + value;
        getModel().setCurrentCounterValue(newValue);
    }
}
