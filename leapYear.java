import java.io.*;

public class leapYear {
    public static void main(String args[]) {
        int year = 0;
        String s;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);

            System.out.println("Enter the year: ");
            s = br.readLine();
            year = Integer.parseInt(s);

            if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0)
                System.out.println("" + year + " is a leap year");
            else
                System.out.println("" + year + " is not a leap year");
        } catch (Exception e) {
        }
    }
}
