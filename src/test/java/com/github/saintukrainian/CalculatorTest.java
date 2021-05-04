package com.github.saintukrainian;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  static Calculator calculator;

  @BeforeAll
  static void init() {
    calculator = new Calculator();
  }

  @AfterAll
  static void cleanup() {
    calculator = null;
  }

  @Test
  void shouldReturnSumOfTwoNumbers() {
    assertEquals(4, calculator.sum(2, 2));
  }

  @Test
  void shouldReturnDivisionOfTwoNumbers() {
    assertEquals(1, calculator.divide(2, 2));
  }

  @Test
  void shouldReturnSubtractionOfTwoNumbers() {
    assertEquals(0, calculator.subtract(2, 2));
  }

  @Test
  void shouldReturnMultiplicationOfTwoNumbers() {
    assertEquals(4, calculator.multiply(2, 2));
  }

  @Test
  void shouldThrowExceptionWhenDividingByZero() {
    assertThrows(ArithmeticException.class, () -> calculator.divide(4, 0));
  }

}