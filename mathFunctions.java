public class mathFunctions {
    public static void main(String[] args) {
        // Basic Math Functions

        // Math.abs()
        // The Math.abs() function returns the absolute value of the parameter passed to
        // it. The absolute value is the positive value of the parameter. If the
        // parameter value is negative, the negative sign is removed and the positive
        // value corresponding to the negative value without sign is returned.

        int abs1 = Math.abs(10);
        System.out.println("Result of Math.abs() function: " + abs1); // abs1 = 10

        int abs2 = Math.abs(-20);
        System.out.println("Result of Math.abs() function: " + abs2); // abs2 = 20

        // Math.ceil()
        // The Math.ceil() function rounds a floating point value up to the nearest
        // integer value. The rounded value is returned as a double.

        double ceil = Math.ceil(7.343);
        System.out.println("Result of Math.ceil() function: " + ceil); // ceil = 8.0

        // Math.floor()
        // The Math.floor() function rounds a floating point value down to the nearest
        // integer value. The rounded value is returned as a double.

        double floor = Math.floor(7.343);
        System.out.println("Result of  Math.floor() function: " + floor); // floor = 7.0
    }
}
