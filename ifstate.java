import java.io.*;

public class ifstate {
    public static void main(String args[]) {
        int age = 0;
        String s;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);

            System.out.print("Enter Your age: ");
            s = br.readLine();
            age = Integer.parseInt(s);

            if (age <= 0)
                System.out.println("You have not born yet!");
            if (age > 0 && age <= 12)
                System.out.println("You are a child ;)");
            if (age > 12 && age <= 19)
                System.out.println("You are a teenager ;)");
            if (age > 19 && age <= 40)
                System.out.println("You are young :D");
            if (age > 40)
                System.out.println("Wish your long life");

        } catch (Exception e) {
        }
    }
}
