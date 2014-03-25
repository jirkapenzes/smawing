package com.jpenzes.demo.counter.uicontrol;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Jirka Penzes
 * Date: 25/03/14 12:17
 */
public class CounterPanel extends JPanel {

    private JLabel counterValueLabel;

    public CounterPanel(int initializeValue) {
        counterValueLabel = new JLabel(Integer.toString(initializeValue));
        initializeUI();
    }

    private void initializeUI() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        setBackground(new Color(55, 82, 110));

        counterValueLabel.setFont(new Font("Verdana", Font.PLAIN, 70));
        counterValueLabel.setForeground(Color.white);

        add(counterValueLabel, BorderLayout.CENTER);
    }

    public JLabel getCounterValueLabel() {
        return counterValueLabel;
    }
}
