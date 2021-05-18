package com.github.saintukrainian;

public class Calculator {

  public double sum(double a, double b) {
    return a + b;
  }

  public double multiply(double a, double b) {
    return a * b;
  }

  public double subtract(double a, double b) {
    return a - b;
  }

  public double divide(double a, double b) {
    if(b == 0) {
      throw new ArithmeticException();
    }
    return a / b;
  }

  public double sin(double x) {
    return Math.sin(x);
  }

  public double cos(double x) {
    return Math.cos(x);
  }

  public double tg(double x) {
    return Math.tan(x);
  }

  public double ctg(double x) {
    return 1.0 / Math.tan(x);
  }
}
