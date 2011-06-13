package com.erikars.borrower;

import com.erikars.borrower.Test;

/**
 * Placeholder while I learn how to use Maven.
 */
public class Borrower {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Test.Pairs test = Test.Pairs.newBuilder()
      .addPair(Test.Pair.newBuilder().setKey("key 1").setValue("value 1").build())
      .addPair(Test.Pair.newBuilder().setKey("key 2").setValue("value 2").build())
      .build();
    System.out.println(test);
  }
}
