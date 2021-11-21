import java.io.*;

public class evenSeries {
    public static void main(String args[]) {
        int i, n, sum = 0;
        String s;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter value of N(>=1): ");
            s = br.readLine();
            n = Integer.parseInt(s);

            for (i = 2; i <= n; i += 2) {
                sum = sum + i;

            }
            
            System.out.println("The sum of 2 + 4 + 6 +......+ " + n + " is : " + sum);

        } catch (Exception e) {}
    }
}