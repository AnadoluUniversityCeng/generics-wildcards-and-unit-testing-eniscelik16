package edu.estu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {
    @Test(timeout = 10000)
    public void test(){
        try {
            App.infiniteLoop(Double.POSITIVE_INFINITY);
            assertTrue(true);
        } catch (Exception e) {
            fail("Passed the infinite loop.");
        }
    }
}
