package com.cbfacademy.operators;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AppTest {

    private double delta = 0.0001; // Used for comparing decimal values with a small tolerance

    @DisplayName("add() method should return correct value: ")
    @ParameterizedTest(name = "{0} + {1} should be {2}")
    @CsvSource({ "20.3, 3.0, 23.3", "0, 0, 0", "-10.0, -5.0, -15.0", "10.5, 5.2, 15.7", "-5.0, 2.0, -3.0", "-26.5, 26.5, 0", "0.357, 0, 0.357" })
    public void add_ReturnsCorrectResult(double operand1, double operand2, double expected) {
        assertThat(App.add(operand1, operand2), is(closeTo(expected, delta)));
    }

    @DisplayName("subtract() method should return correct value: ")
    @ParameterizedTest(name = "{0} - {1} should be {2}")
    @CsvSource({ "20.3, 3.0, 17.3", "0, 0, 0", "-10.0, -5.0, -5.0", "10.5, 5.2, 5.3", "-5.0, 2.0, -7.0", "-5.5, -3.1, -2.4", "-3.1, -5.5, 2.4" })
    public void subtract_ReturnsCorrectResultWithDoubleInputs(double operand1, double operand2, double expected) {
        assertThat(App.subtract(operand1, operand2), is(closeTo(expected, delta)));
    }

    @DisplayName("multiply() method should return correct value: ")
    @ParameterizedTest(name = "{0} * {1} should be {2}")
    @CsvSource({ "20.3, 3.0, 60.9", "0, 0, 0", "-10.0, -5.0, 50.0", "10.5, 5.2, 54.6", "-5.0, 2.0, -10.0" })
    public void multiply_ReturnsCorrectResult(double operand1, double operand2, double expected) {
        assertThat(App.multiply(operand1, operand2), is(closeTo(expected, delta)));
    }

    @DisplayName("areEqual() method should return correct value: ")
    @ParameterizedTest(name = "{0} == {1} should be {2}")
    @CsvSource({ "20.3, 20.3, true", "0, 0, true", "-10.0, -5.0, false", "10.5, 10.4, false", "0, 0.01, false" })
    public void areEqual_ReturnsCorrectResult(double operand1, double operand2, Boolean expected) {
        assertThat(App.areEqual(operand1, operand2), is(expected));
    }

    @DisplayName("isLessThan() method should return correct value: ")
    @ParameterizedTest(name = "{0} < {1} should be {2}")
    @CsvSource({ "20.3, 20.3, false", "0, 0, false", "-10.0, -5.0, true", "10.5, 10.4, false", "0, 0.01, true", "-1, 1, true" })
    public void isLessThan_ReturnsCorrectResult(double operand1, double operand2, Boolean expected) {
        assertThat(App.isLessThan(operand1, operand2), is(expected));
    } 

    @DisplayName("isMoreThan() method should return correct value: ")
    @ParameterizedTest(name = "{0} > {1} should be {2}")
    @CsvSource({ "20.3, 20.3, false", "0, 0, false", "-10.0, -5.0, false", "10.5, 10.4, true", "0, 0.01, false", "1, -1, true" })
    public void isMoreThan_ReturnsCorrectResult(double operand1, double operand2, Boolean expected) {
        assertThat(App.isMoreThan(operand1, operand2), is(expected));
    }
}
