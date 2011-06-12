package com.erikars.borrower;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BorrowerTest extends TestCase {
  public BorrowerTest(String testName) {
    super(testName);
  }

  public static Test suite() {
    return new TestSuite(BorrowerTest.class);
  }

  public void testBorrower() {
    assertTrue(true);
  }
}
