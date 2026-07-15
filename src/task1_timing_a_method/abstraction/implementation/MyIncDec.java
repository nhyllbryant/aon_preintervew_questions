package task1_timing_a_method.abstraction.implementation;


import task1_timing_a_method.abstraction.IncDec;

public class MyIncDec implements IncDec {


    private int x;

    public MyIncDec(int x) {
        this.x = x;
    }

    public void increment() {
        this.x++;
    }

    public void decrement() {
        this.x--;
    }


}
