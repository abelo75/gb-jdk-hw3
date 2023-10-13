public class Main {

    static <T> boolean compareArrays(T[] a, T[] b) {
        if (a.getClass()!=b.getClass()) {
            throw new IllegalArgumentException("Different type");
        }

        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Calculator test");
        System.out.println("Sum of 1 and 2 is " + Calculator.sum(1, 2));
        System.out.println("Subtraction of 1 and 2 is " + Calculator.subtract(1, 2));
        System.out.println("Multiplication of 1 and 2 is " + Calculator.multiply(1, 2));
        System.out.println("Division of 1 and 2 is " + Calculator.divide(1, 2));

        System.out.printf("Sum of 1 and %s is %s\n", 2.00000000001, Calculator.sum(1, 2.00000000001));
        System.out.printf("Subtraction of 1 and %s is %s\n", 2.0, Calculator.subtract(1, 2.0));
        System.out.printf("Multiplication of 1 and %s is %s\n", 2f, Calculator.multiply(1, 2f));
        System.out.printf("Division of %s and 2 is %s\n", 1f, Calculator.divide(1f, 2));
        try {
            Calculator.divide(1, 0);
        } catch (DivideByZeroException e) {
            System.out.println("Divide by zero passed");
        }

        try {
            Calculator.divide(null, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Null passed");
        }

        Pair<Integer, String> pair = new Pair<>(1, "one");
        System.out.println(pair);

        Pair<Object, Object> pair2 = new Pair<>(new Object(), "one");
        System.out.println(pair2);

        System.out.println("arrays compare 1 " + compareArrays(new Integer[]{1, 2, 3}, new Integer[]{1, 2, 3}));
        System.out.println("arrays compare 2 " + compareArrays(new Integer[]{1, 2, 3}, new Integer[]{1, 1, 3}));
        System.out.println("arrays compare 3 " + compareArrays(new Integer[]{1, 1, 3, 4}, new Integer[]{1, 1, 3}));
        try {
            System.out.println("arrays compare 4 " + compareArrays(new String[]{"1", "1", "3"}, new Integer[]{1, 1, 3}));
        } catch (IllegalArgumentException e) {
            System.out.println("arrays compare 4 " + e.getMessage());
        }
    }
}
