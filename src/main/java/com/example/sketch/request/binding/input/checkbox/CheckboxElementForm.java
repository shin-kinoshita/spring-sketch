package com.example.sketch.request.binding.input.checkbox;

/**
 * @author subaru
 */
public class CheckboxElementForm {
    private Boolean apple;
    //    private Boolean apple = true;
    private Boolean banana;
    private Boolean mango;

    public void setApple(boolean apple) {
        this.apple = apple;
    }

    public Boolean getApple() {
        return apple;
    }

    public void setBanana(Boolean banana) {
        this.banana = banana;
    }

    public Boolean getBanana() {
        return banana;
    }

    public void setMango(Boolean mango) {
        this.mango = mango;
    }

    public Boolean getMango() {
        return mango;
    }
}
