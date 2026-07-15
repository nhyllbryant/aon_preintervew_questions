## Task 1 – Timing a Method

### Part 1 : My Approach

1.) Created a wrapper class that implements IncDec.

2.) Inside this wrapper, delegated calls to the real implementation (MyIncDec).

3.) Measure start and end time around each method call.

4.) Log the duration.
### Part 2 : Other Ideas

1.) **Dynamic Proxy**\
I will use Java’s Proxy API to intercept method calls at runtime. This avoids writing boilerplate wrappers for every interface. 

2.) **Aspect-Oriented Programming**\
I will use define cross‑cutting concerns like logging/timing separately. By adding annotations to methods or apply aspects globally.

3.) **Interceptors**\
I will use interceptors to wrap method calls for logging, security, or timing.

4.) **Profiling Tools**\
Instead of coding timing logic, I will use profilers like JProfiler to measure execution time across the application without modifying source code.

<br>

## Task 2 – Find Arrays
