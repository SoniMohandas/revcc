import java.util.Arrays;

public class Main {
    
    public static boolean isSameNum(int a, int b) {
        return a == b;
    }

    public static void main(String[] args) {
        System.out.println(isSameNum(4, 8));
        System.out.println(isSameNum(2, 2));
        System.out.println(isSameNum(42, 32));
    }
}