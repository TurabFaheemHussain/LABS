package scd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({
        OddEvenTest.class,
        PrimeTest.class,
        FactorialTest.class})
public class AllTests {
}