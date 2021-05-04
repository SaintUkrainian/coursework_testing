package com.github.saintukrainian;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  static Calculator calculator;

  @BeforeAll
  public static void init() {
    calculator = new Calculator();
  }

  @AfterAll
  public static void cleanup() {
    calculator = null;
  }

  @Test
  public void shouldReturnSumOfTwoNumbers() {
    assertEquals(4, calculator.sum(2, 2));
  }

  @Test
  public void shouldReturnDivisionOfTwoNumbers() {
    assertEquals(1, calculator.divide(2, 2));
  }

  @Test
  public void shouldReturnSubtractionOfTwoNumbers() {
    assertEquals(0, calculator.subtract(2, 2));
  }

  @Test
  public void shouldReturnMultiplicationOfTwoNumbers() {
    assertEquals(4, calculator.multiply(2, 2));
  }

}