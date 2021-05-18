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
    // given
    double a = 1.539;
    double b = 2.193;

    // when
    double result = calculator.sum(a, b);

    // then
    assertEquals(3.732, result);
  }

  @Test
  void shouldReturnDivisionOfTwoNumbers() {
    // given
    int a = 2;
    int b = 2;

    // when
    double result = calculator.divide(a, b);

    // then
    assertEquals(1, result);
  }

  @Test
  void shouldReturnSubtractionOfTwoNumbers() {
    // given
    int a = 2;
    int b = 2;

    // when
    double result = calculator.subtract(a, b);

    // then
    assertEquals(0, result);
  }

  @Test
  void shouldReturnMultiplicationOfTwoNumbers() {
    // given
    int a = 2;
    int b = 2;

    // when
    double result = calculator.multiply(a, b);

    // then
    assertEquals(4, result);
  }

  @Test
  void shouldThrowExceptionWhenDividingByZero() {
    // given
    int a = 4;
    int b = 0;

    // then
    assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));
  }

  @Test
  void shouldReturnTgValue() {
    // given
    double x = 1.2;

    // when
    double result = calculator.tg(x);

    // then
    assertEquals(2.5721516221263188, result);
  }

  @Test
  void shouldReturnCtgValue() {
    // given
    double x = 1.32;

    // when
    double result = calculator.ctg(x);

    // then
    assertEquals(0.25619034081545183, result);
  }

  @Test
  void shouldReturnSinValue() {
    // given
    double x = 1.49;
    // when
    double result = calculator.sin(x);

    // then
    assertEquals(0.9967377520431434, result);
  }

  @Test
  void shouldReturnCosValue() {
    // given
    double x = -1.453;

    // when
    double result = calculator.cos(x);

    // then
    assertEquals(0.11752409259940473, result);
  }

}