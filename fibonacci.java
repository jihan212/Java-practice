import java.io.*;

public class fibonacci {
    public static void main(String args[]) {

        int f0 = 0, f1 = 1, f, n;
        String s;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the value for n: ");
            s = br.readLine();
            n = Integer.parseInt(s);

            System.out.println("Fibonacci numbers 0 to " + n + " is: ");

            for (int i = 1; i <= n; i++) {
                f = f0 + f1;
                System.out.println("" + f + "");
                f1 = f0;
                f0 = f;
            }

        } catch (Exception e) {
        }
    }
}
