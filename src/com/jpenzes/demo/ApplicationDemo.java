package com.jpenzes.demo;

import com.jpenzes.demo.counter.CounterMainFrame;

import javax.swing.*;

/**
 * Author: Jirka Penzes
 * Date: 25/03/14 11:09
 */
public class ApplicationDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CounterMainFrame mainFrame = new CounterMainFrame();
                mainFrame.show();
            }
        });
    }
}
