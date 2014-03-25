package com.jpenzes.demo.counter.view;

import com.jpenzes.demo.counter.model.MenuModel;
import com.jpenzes.demo.counter.uicontrol.MenuPanel;
import com.jpenzes.smawing.SFrame;
import com.jpenzes.smawing.SView;

import javax.swing.*;

/**
 * Author: Jirka Penzes
 * Date: 25/03/14 12:00
 */
public class MenuView extends SView<MenuModel> {

    private MenuPanel menuPanel;

    public MenuView(SFrame frame, Class<MenuModel> modelClassName) {
        super(frame, modelClassName);
    }

    @Override
    protected JComponent layout() {
        if (menuPanel == null)
            menuPanel = new MenuPanel(getModel().getIncrementButtonText(), getModel().getDecrementButtonText());
        return menuPanel;
    }

    @Override
    public void updateView() {
        menuPanel.getIncrementButton().setText(getModel().getIncrementButtonText());
        menuPanel.getIncrementButton().setText(getModel().getIncrementButtonText());
    }

    public JButton getIncrementButton() {
        return menuPanel.getIncrementButton();
    }

    public JButton getDecrementButton() {
        return menuPanel.getDecrementButton();
    }
}
