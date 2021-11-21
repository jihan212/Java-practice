class over {
    int cal(int x, int y) {
        int z;
        z = x + y;
        System.out.println("Using summation method");
        System.out.println("Result is: " + z);
        return 0;
    }

    float cal(float m1, float m2) {
        float mark;
        mark = m1 + m2;
        System.out.println("Using float method");
        System.out.println("The mark is: " + mark);
        return 0;
    }

    int cal(int x) {
        System.out.println("Using Input/Output method");
        System.out.println(x);
        return 0;
    }
}

public class method {
    public static void main(String args[]) {
        over s = new over();
        s.cal(34.25f, 50.26f);
        s.cal(44);
        s.cal(23, 10);
    }
}
