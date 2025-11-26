package com.codesimcoe.tci;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class OneTest {

  @Test
  public void test() {
    long count = MyEntity.count();
    Assertions.assertEquals(0, count);
  }
}