import java.util.ArrayList;

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

    public static int checkSum(int one, int two) {
        if (one + two == 100) {
            return 2;
        } else {
            return (one + two > 100) ? 1 : 0;
        }
    }

    public static double gpaPoint(String grade) {
        switch (grade) {
            case "A+":
                return 4;
            case "A":
                return 4;
            case "A-":
                return 3.7;
            case "B+":
                return 3.3;
            case "B":
                return 3;
            case "B-":
                return 2.8;
            case "C+":
                return 2.5;
            case "C":
                return 2;
            case "C-":
                return 1.8;
            case "D":
                return 1.5;
            case "F":
                return 0;
            default:
                return -1;
        }
    }

    public static int sumOfDig(int var) {
        int result = 0;
        while (var > 0) {
            result += var % 10;
            var /= 10;
        }
        return result;
    }

    public static String upperLower(String x) {
        return (x.length() % 2 == 0) ? x.toUpperCase() : x.toLowerCase();
    }

    public static int findMaxVal(int[] arr) {
        int xd = 0;
        for (int val : arr) {
            if (val > xd) {
                xd = val;
            }
        }
        return xd;
    }

    public static int[] sortAsc(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void printMat(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                } else if (i > j) {
                    arr[i][j] = -1;
                } else {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printPascalTri(int size) {
        int[][] triangle = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; (j <= i); j++) {
                if (i == 0 || j == 0) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (triangle[i][j] != 0)
                    System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//
class rightAngleTriangle {
    public double length;
    public double height;

    public rightAngleTriangle(int b, int a) {
        length = b;
        height = a;
    }

    public double area() {
        return (length * height) / 2;
    }

}

class challenge_one {
    public static double test(rightAngleTriangle rt) {
        return rt.area();
    }

}

//
class student {
    private String name;
    private double mark1;
    private double mark2;

    public double get_Marks() {
        return mark1 > mark2 ? mark2 : mark1;
    }

    public double calc_average() {
        return (mark1 + mark2) / 2;
    }

    public student() {
        name = "";
        mark1 = 0;
        mark2 = 0;
    };

    public student(String N, double m, double n) {
        name = N;
        mark1 = m;
        mark2 = n;
    };

}

class challenge_two {
    public static double test(student s, int check) {
        if (check == 0) {
            return s.get_Marks();
        } else {
            return s.calc_average();
        }
    }
}

//
class Animal {
    private int age;
    private String name;

    void set_data(int a, String b) {
        age = a;
        name = b;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Zebra extends Animal {

    String message_zebra(String str) {
        str = "The zebra named " + getName() + " is " + getAge() + " years old. The zebra comes from Africa";
        return str;
    }
}

class Dolphin extends Animal {

    String message_dolphin(String str) {
        str = "The dolphin named " + getName() + " is " + getAge() + " years old. The dolphin comes from New Zeland";
        return str;
    }
}

//
class FindMax {
    public static <T extends Comparable<T>> T array_max(T data[], int n) {
        for (int i = 1; i < n; i++) {
            if (data[0].compareTo(data[i]) < 0) {
                data[0] = data[i];
            }
        }
        return data[0];
    }
}

//
class Swapper {
    public static <T> void swap_values(T[] x1, T[] x2) {
        T temp = x1[0];
        x1[0] = x2[0];
        x2[0] = temp;
    }

    public static String test(Integer[] v1, Integer[] v2, Double[] v3, Double[] v4) {
        String str = "";
        swap_values(v1, v2);
        swap_values(v3, v4);
        str = String.valueOf(v1[0]) + ", " + String.valueOf(v2[0]) + ", " + String.valueOf(v3[0]) + ", "
                + String.valueOf(v4[0]);
        return str;
    }
}

//
class ArrList1 {
    public static void zerosToStart(ArrayList<Integer> arrList) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        int newArray_index = 0;

        for (int i = 0; i < arrList.size(); i++) {

            if (arrList.get(i) == 0)
                newArrayList.add(newArray_index++, arrList.get(i));
        }

        for (int i = 0; i < arrList.size(); i++) {

            if (arrList.get(i) != 0)
                newArrayList.add(newArray_index++, arrList.get(i));
        }

        for (int j = 0; j < newArrayList.size(); j++) {
            arrList.set(j, newArrayList.get(j));
        }
    }
}

//
class ArrList2 {
    public static void zerosToStart(ArrayList<Integer> arrList) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        int newArray_index = 0;

        for (int i = 0; i < arrList.size(); i++) {

            if (arrList.get(i) == 0)
                newArrayList.add(newArray_index++, arrList.get(i));
        }

        for (int i = 0; i < arrList.size(); i++) {

            if (arrList.get(i) != 0)
                newArrayList.add(newArray_index++, arrList.get(i));
        }

        for (int j = 0; j < newArrayList.size(); j++) {
            arrList.set(j, newArrayList.get(j));
        }
    }
}