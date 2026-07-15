package task1_timing_a_method;

import task1_timing_a_method.abstraction.IncDec;
import task1_timing_a_method.abstraction.implementation.MyIncDec;
import task1_timing_a_method.abstraction.implementation.TimedIncDec;

public class Main {
    public static void main(String[] args) {

        IncDec obj = new TimedIncDec(new MyIncDec(10));
        obj.increment();
        obj.decrement();


    }
}
