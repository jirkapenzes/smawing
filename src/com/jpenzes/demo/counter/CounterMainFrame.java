package com.jpenzes.demo.counter;

import com.jpenzes.demo.counter.controller.CounterController;
import com.jpenzes.demo.counter.controller.MenuController;
import com.jpenzes.demo.counter.model.CounterModel;
import com.jpenzes.demo.counter.model.MenuModel;
import com.jpenzes.demo.counter.view.CounterView;
import com.jpenzes.demo.counter.view.MenuView;
import com.jpenzes.smawing.SFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Jirka Penzes
 * Date: 25/03/14 11:04
 */
public class CounterMainFrame extends SFrame {

    @Override
    protected void initialize() {
    }

    @Override
    protected void registerAllModels() {
        registerModel(CounterModel.class, new CounterModel());
        registerModel(MenuModel.class, new MenuModel());
    }

    @Override
    protected void registerAllViews() {
        registerView(CounterView.class, new CounterView(this, CounterModel.class));
        registerView(MenuView.class, new MenuView(this, MenuModel.class));
    }

    @Override
    protected void registerAllControllers() {
        registerController(CounterController.class, new CounterController(this, CounterView.class, CounterModel.class));
        registerController(MenuController.class, new MenuController(this, MenuView.class, MenuModel.class));
    }

    @Override
    protected JFrame layout() {
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(getView(CounterView.class).getContentPane(), BorderLayout.CENTER);
        contentPane.add(getView(MenuView.class).getContentPane(), BorderLayout.SOUTH);
        return getFrameFactory().frame("Counter demo", contentPane);
    }
}
