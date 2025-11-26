public class ExceptionTask1 {
    public ExceptionTask1(String message) {
    }

    public void testException(int value) {
        if (value == 1) {
            throw new ArithmeticException("Arithmetic exception triggered");
        } else if (value == 2) {
            throw new ArrayIndexOutOfBoundsException("Array index exception triggered");
        } else {
            System.out.println("No exception thrown.");
        }
    }
}
