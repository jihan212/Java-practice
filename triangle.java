import java.io.*;
public class triangle {
    public static void main(String args[]) {
        int width, height;
        String s;   
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the Width of the triangle: ");
            s = br.readLine();
            width = Integer.parseInt(s);

            System.out.println("Enter the Height of the triangle: ");
            s = br.readLine();
            height = Integer.parseInt(s);

            int area = (width * height) / 2;
            
            System.out.println("Area of Triangle is: " + area);

        } catch (Exception e) {}
    }
}