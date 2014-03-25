package com.jpenzes.demo.counter.controller;

import com.jpenzes.demo.counter.model.MenuModel;
import com.jpenzes.demo.counter.view.MenuView;
import com.jpenzes.smawing.SController;
import com.jpenzes.smawing.SFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author: Jirka Penzes
 * Date: 25/03/14 12:02
 */
public class MenuController extends SController<MenuView, MenuModel> {

    public MenuController(SFrame frame, Class<MenuView> view, Class<MenuModel> model) {
        super(frame, view, model);
    }

    @Override
    protected void initialize() {
        getView().getIncrementButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                incrementButtonActionPerformed(actionEvent);
            }
        });
        getView().getDecrementButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                decrementButtonActionPerformed(actionEvent);
            }
        });
    }

    private void incrementButtonActionPerformed(ActionEvent actionEvent) {
        getMainFrame().getController(CounterController.class).incrementCounterValue();
    }

    private void decrementButtonActionPerformed(ActionEvent actionEvent) {
        getMainFrame().getController(CounterController.class).decrementCounterValue();
    }
}
