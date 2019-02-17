public class Recursion {

    public static int factorial(int n) {
        if (n == 1 || n == 0)  // base case
            return 1;
        else {
            int result = n * factorial(n - 1);
            return result;
        }
    }

    public static int myPow(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * myPow(x, y - 1);
        }
    }

    public  static String reverse(String str){
        if (str.isEmpty()){
            return  str;
        }
        else {
            return reverse(str.substring(1)) + str.charAt(0);
        }

    }


}
