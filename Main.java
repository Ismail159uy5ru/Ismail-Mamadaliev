import java.util.Scanner;

public class Main {

    public static String calc(String input) {
        String res = "";

        String[] size = input.split(" ");
        if (size.length != 3) {
            System.out.println("throws Exception");
            System.exit(0);
        }

        try {
            
            int a = Integer.parseInt(size[0]);

            if (a > 10 || a < 1) {

                System.out.println("throws Exception");
                System.exit(0);
            }

            char c = size[1].charAt(0);
            if (!(c == '*' || c == '+' || c == '-' || c == '/')) {

                System.out.println("throws Exception");
                System.exit(0);
            }

            int b = Integer.parseInt(size[2]);

            if (b > 10 || b < 1) {
                System.out.println("throws Exception");
                System.exit(0);
            }

            switch (c) {
                case '-':
                    res = Integer.toString(a - b);
                    break;
                case '+':
                    res =Integer.toString(a + b);
                    break;
                case '*':
                    res = Integer.toString(a * b);
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("throws Exception");
                        System.exit(0);
                    } else {
                        res = Integer.toString(a / b);
                        break;
                    }
            }

        } catch (NumberFormatException e) {
            System.out.println("throws Exception");
            System.exit(0);
        }
        
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String result = calc(sc.nextLine());

        System.out.print(result);

    }
}