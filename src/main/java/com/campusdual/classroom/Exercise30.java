package com.campusdual.classroom;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            int result = divisionWithCustomException(10, 0);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}

