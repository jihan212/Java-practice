import java.io.*;

public class nSeris {
    public static void main(String args[]) {
        int i, n, sum = 0;
        String s;
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter value of N(>=1): ");
            s = br.readLine();
            n = Integer.parseInt(s);


            for (i = 1; i <= n; i++) {
                sum = sum + i;
                System.out.println("" + i + "\t" + sum);
            }

            System.out.println("The sum of " + n + " is : " + sum);

        } catch (Exception e) {
        }
    }
}
