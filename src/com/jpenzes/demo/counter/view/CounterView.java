package com.jpenzes.demo.counter.view;

import com.jpenzes.demo.counter.model.CounterModel;
import com.jpenzes.demo.counter.uicontrol.CounterPanel;
import com.jpenzes.smawing.SFrame;
import com.jpenzes.smawing.SView;

import javax.swing.*;

/**
 * Author: Jirka Penzes
 * Date: 25/03/14 11:59
 */
public class CounterView extends SView<CounterModel> {

    private CounterPanel counterPanel;

    public CounterView(SFrame frame, Class<CounterModel> modelClassName) {
        super(frame, modelClassName);
    }

    @Override
    protected JComponent layout() {
        if (counterPanel == null)
            counterPanel = new CounterPanel(getModel().getCurrentCounterValue());
        return counterPanel;
    }

    @Override
    public void updateView() {
        JLabel counterValueLabel = counterPanel.getCounterValueLabel();
        int currentCounterValue = getModel().getCurrentCounterValue();

        counterValueLabel.setText(Integer.toString(currentCounterValue));
    }
}
