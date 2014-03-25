package com.jpenzes.demo.counter.uicontrol;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Jirka Penzes
 * Date: 25/03/14 12:10
 */
public class MenuPanel extends JPanel {

    private final JButton incrementButton;
    private JButton decrementButton;

    public MenuPanel(String incrementButtonText, String decrementButtonText) {
        incrementButton = new JButton(incrementButtonText);
        decrementButton = new JButton(decrementButtonText);
        initializeUI();
    }

    private void initializeUI() {
        setBackground(new Color(92, 119, 132));
        setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, new Color(61, 64, 65)));
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        add(incrementButton);
        add(decrementButton);
    }

    public JButton getIncrementButton() {
        return incrementButton;
    }

    public JButton getDecrementButton() {
        return decrementButton;
    }
}
