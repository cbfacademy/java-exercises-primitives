package com.cbfacademy.arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Arrays Exercises")
public class AppTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    @DisplayName("createIntegerArray() should return an array of 8 Integer elements")
    public void createIntegerArray_ReturnsArrayOf8Integers() {
        Integer[] arr = App.createIntegerArray();
        assertThat(arr.length, is(8));
    }

    @Test
    @DisplayName("createFloatArray() should return an array of 12 Float elements")
    public void createFloatArray_ReturnsArrayOf12Floats() {
        Float[] arr = App.createFloatArray();
        assertThat(arr.length, is(12));
    }

    @Test
    @DisplayName("createDoubleArray() should return an array of 5 Double elements")
    public void createDoubleArray_ReturnsArrayOf5Doubles() {
        Double[] arr = App.createDoubleArray();
        assertThat(arr.length, is(5));
    }

    @Test
    @DisplayName("createBooleanArray() should return an array of 6 Boolean elements")
    public void createBooleanArray_ReturnsArrayOf6Booleans() {
        Boolean[] arr = App.createBooleanArray();
        assertThat(arr.length, is(6));
    }

    @Test
    @DisplayName("printFifthElements() should not throw and should print the 5th element of each array")
    public void printFifthElements_DoesNotThrow() {
        assertDoesNotThrow(() -> App.printFifthElements());
    }

    @Test
    @DisplayName("printFifthElements() should print the correct 5th element from each array")
    public void printFifthElements_PrintsCorrectElements() {
        // Arrange: get the 5th element (index 4) from each array
        Integer intVal = App.createIntegerArray()[4];
        Float floatVal = App.createFloatArray()[4];
        Double doubleVal = App.createDoubleArray()[4];
        Boolean boolVal = App.createBooleanArray()[4];

        // Act
        App.printFifthElements();
        String output = systemOutRule.getLog();

        // Assert: check that each value is present in the output
        assertThat(output, org.hamcrest.CoreMatchers.containsString(intVal.toString()));
        assertThat(output, org.hamcrest.CoreMatchers.containsString(floatVal.toString()));
        assertThat(output, org.hamcrest.CoreMatchers.containsString(doubleVal.toString()));
        assertThat(output, org.hamcrest.CoreMatchers.containsString(boolVal.toString()));
    }
} 