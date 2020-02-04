public class Exercise {
    public static void printVariables() {
        short short_number = 5;
        int int_number = 1000;
        long long_number = 100000000;
        char char_name = 'N';
        boolean bool_accept = true;
        float float_number = 10.292f;
        double double_number = 10.0;

        System.out.println("Value of Short is: ");
        System.out.println(short_number);

        System.out.println("Value of Int is: ");
        System.out.println(int_number);

        System.out.println("Value of Long is: ");
        System.out.println(long_number);

        System.out.println("Value of Float is: ");
        System.out.println(float_number);

        System.out.println("Value of Double is: ");
        System.out.println(double_number);

        System.out.println("Value of Char is: ");
        System.out.println(char_name);

        System.out.println("Value of Bool is: ");
        System.out.println(bool_accept);
    }

    public static double math_expr(double x, double y, double z) {
        double answer;
        answer = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));
        return answer;
    }

    public static boolean logic_expr(boolean x, boolean y) {
        boolean answer;
        answer = !(((!x) ^ x) && y);
        return answer;
    }

    public static String sc(String text) {
        String answer;
        answer = (text.trim()).substring(0, 6).toUpperCase();
        return answer;
    }

    public static String evenodd(int x) {
        return ((x % 2) == 0) ? "even" : "odd";
    }

    public static String week_day(int x) {
        switch (x) {
        case 1:
            return "Monday";
        case 2:
            return "Tuesday";
        case 3:
            return "Wednesday";
        case 4:
            return "Thursday";
        case 5:
            return "Friday";
        case 6:
            return "Saturday";
        case 7:
            return "Sunday";
        default:
            return "";
        }
    }

    public static String multiplicationTable(int num) {
        int i = 10, k = 1;
        int answer;
        String table = "";
        while (i > 0) {
            answer = num * k;
            System.out.println(num + " x " + k + " = " + answer);
            table += String.valueOf(answer) + " ";
            k++;
            i--;
        }
        System.out.println(table);
        return table;
    }

    public static String fibonacci(int n) {
        String fib = "";
        int first = 0, second = 1, fibonacci = 0;
        System.out.println("Fibonacci Series upto " + n + " Terms ");

        for (int c = 0; c < n; c++) {
            if (c <= 1) {
                fibonacci = c;
                fib += String.valueOf(fibonacci) + " ";
            } else {
                fibonacci = first + second;
                first = second;
                second = fibonacci;
                fib += String.valueOf(fibonacci) + " ";
            }
            System.out.println(fibonacci + " ");
        }
        return fib;
    }

    public static void pyramid(int rows) {
        System.out.println("Number of Rows = " + rows);
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void pyramidMirror(int rows) {
        System.out.println("Number of Rows = " + rows);
        int i = 1, j = 1, k = 0;
        while (i <= rows) {
            k = rows - i;
            while (k >= 0) {
                System.out.print(" ");
                k--;
            }
            j = 1;
            while (j <= i) {
                System.out.print("# ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}