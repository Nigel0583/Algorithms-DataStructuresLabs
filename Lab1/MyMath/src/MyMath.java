public class MyMath {
    public static int findSmallestNum(int x, int y, int z) {
        int smallest = x;
        if (y < smallest)
            smallest = y;
        if (z < smallest)
            smallest = z;
        return smallest;
    }

    public static double mathPower(double a, int b) {
        double power = 1;

        if (b < 0) {
            a = 1.0 / a;
            b = -b;
        }

        for (int i = 0; i < b; i++) {
            power = power * a;
        }
        return power;
    }

    public static int sumOfNums(int n) {
        int sum = 0;

        sum = n * (1 + n) / 2;
        return sum;
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));

    }

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static int countWords(String w) {
        int wordCount = 0;
        boolean word = false;
        int end = w.length() - 1;

        for (int i = 0; i < w.length(); i++) {
            if (Character.isLetter(w.charAt(i)) && i != end) {
                word = true;
            } else if (!Character.isLetter(w.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(w.charAt(i)) && i == end) {
                wordCount++;
            }

        }
        return wordCount;
    }

    public static boolean validate(String password) {
        boolean Uppercase = !password.equals(password.toLowerCase());
        boolean Lowercase = !password.equals(password.toUpperCase());
        int length = 8;
        if (password.length() < length) {
            System.out.println("Invalid password. More the 8 characters");
            return false;
        } else {
            char ch;
            int count = 0;
            for (int i = 0; i < password.length(); i++) {
                ch = password.charAt(i);
                if (!Character.isLetterOrDigit(ch)) {
                    System.out.println("Invalid password.");
                    return false;
                }
                else if (!Uppercase){
                    System.out.println("Invalid password. Must have an uppercase Characters");
                    return false;
                }
                else if (!Lowercase){
                    System.out.println("Invalid password. Must have an lowercase Characters");
                    return false;
                }
                else if (Character.isDigit(ch)) {
                    count++;
                }
            }
            if (count <= 1) {
                System.out.println("Invalid password. More then one digit");
                return false;
            }
        }
        return true;
    }

}
