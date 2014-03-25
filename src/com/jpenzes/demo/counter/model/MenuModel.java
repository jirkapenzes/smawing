package com.jpenzes.demo.counter.model;

import com.jpenzes.smawing.SModel;

/**
 * Author: Jirka Penzes
 * Date: 25/03/14 11:54
 */
public class MenuModel extends SModel {

    private String decrementButtonText;
    private String incrementButtonText;

    public MenuModel() {
        incrementButtonText = "Increment value";
        decrementButtonText = "Decrement value";
    }

    public String getDecrementButtonText() {
        return decrementButtonText;
    }

    public void setDecrementButtonText(String decrementButtonText) {
        this.decrementButtonText = decrementButtonText;
        requestNotify();
    }

    public String getIncrementButtonText() {
        return incrementButtonText;
    }

    public void setIncrementButtonText(String incrementButtonText) {
        this.incrementButtonText = incrementButtonText;
        requestNotify();
    }
}
