package com.cbfacademy.arrays;

public class App {
    public static Integer[] createIntegerArray() {
        Integer[] arr = new Integer[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static Float[] createFloatArray() {
        Float[] arr = new Float[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) i;
        }
        return arr;
    }

    public static Double[] createDoubleArray() {
        Double[] arr = new Double[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double) i;
        }
        return arr;
    }

    public static Boolean[] createBooleanArray() {
        Boolean[] arr = new Boolean[6];
        boolean[] pattern = { true, false, true, false, true, false };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pattern[i];
        }
        return arr;
    }

    public static void printFifthElements() {
        Integer[] intArr = createIntegerArray();
        Float[] floatArr = createFloatArray();
        Double[] doubleArr = createDoubleArray();
        Boolean[] boolArr = createBooleanArray();
        System.out.println(intArr[4]);
        System.out.println(floatArr[4]);
        System.out.println(doubleArr[4]);
        System.out.println(boolArr[4]);
    }

    // Stretch task (no unit tests provided)
    public static Object[][] createMatrix() {
        Object[][] matrix = new Object[4][];
        matrix[0] = createIntegerArray();
        matrix[1] = createFloatArray();
        matrix[2] = createDoubleArray();
        matrix[3] = createBooleanArray();
        return matrix;
    }
}