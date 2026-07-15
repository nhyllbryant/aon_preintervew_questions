package task1_timing_a_method.abstraction.implementation;

import task1_timing_a_method.abstraction.IncDec;

public class TimedIncDec implements IncDec {

    private final IncDec delegate;

    public TimedIncDec(IncDec delegate) {
        this.delegate = delegate;
    }

    @Override
    public void increment() {
        long start = System.currentTimeMillis();
        delegate.increment();
        long end = System.currentTimeMillis();
        System.out.println("increment() took " + (end - start) + " ms");
    }

    @Override
    public void decrement() {
        long start = System.currentTimeMillis();
        delegate.decrement();
        long end = System.currentTimeMillis();
        System.out.println("decrement() took " + (end - start) + " ms");
    }
}
