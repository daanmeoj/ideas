package com.codewithmosh;

public abstract class UIControl {
    boolean isEnabled=true;

//    public UIControl(boolean isEnabled) {
//        this.isEnabled=isEnabled;
//        //System.out.println("UI Control");
//    }

    public abstract void render();

    public final void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
