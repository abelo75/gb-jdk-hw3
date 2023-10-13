public class Calculator  {

    private static void nullChecker(Number a, Number b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Null not allowed here");
        }
    }

    public static <T1 extends Number, T2 extends Number> Number sum(T1 a, T2 b) {
        Calculator.nullChecker(a, b);

        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() + b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() + b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() + b.longValue();
        } else {
            return a.intValue() + b.intValue();
        }
    }

    public static <T1 extends Number, T2 extends Number> Number subtract(T1 a, T2 b) {
        Calculator.nullChecker(a, b);

        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() - b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() - b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() - b.longValue();
        } else {
            return a.intValue() - b.intValue();
        }
    }

    public static <T1 extends Number, T2 extends Number> Number multiply(T1 a, T2 b) {
        Calculator.nullChecker(a, b);

        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() * b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() * b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() * b.longValue();
        } else {
            return a.intValue() * b.intValue();
        }
    }

    public static <T1 extends Number, T2 extends Number> Number divide(T1 a, T2 b) {
        Calculator.nullChecker(a, b);

        try {
            if (a instanceof Double || b instanceof Double) {
                return a.doubleValue() / b.doubleValue();
            } else if (a instanceof Float || b instanceof Float) {
                return a.floatValue() / b.floatValue();
            } else if (a instanceof Long || b instanceof Long) {
                return a.longValue() / b.longValue();
            } else {
                return a.intValue() / b.intValue();
            }
        } catch (ArithmeticException e) {
            throw new DivideByZeroException();
        }
    }
}
