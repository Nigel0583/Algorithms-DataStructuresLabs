import java.util.Scanner;

public class TestMyMath {
    public static void main(String[] args) {
        int result = MyMath.findSmallestNum(1, 2, 3);
        System.out.println("Result: " + result);
        //Answer should be 1

        result = MyMath.findSmallestNum(4, 2, 7);
        System.out.println("Result: " + result);
        //Answer should be 2

        result = MyMath.findSmallestNum(10, 2, -1);
        System.out.println("Result: " + result);
        //Answer should be -1

        double power = MyMath.mathPower(2, 2);
        System.out.println("Answer: " + power);
        //Expect 4

        power = MyMath.mathPower(-5, 2);
        System.out.println("Answer: " + power);
        //Expect 25

        power = MyMath.mathPower(-5, -2);
        System.out.println("Answer: " + power);
        //Expect 0.04

        int sum = MyMath.sumOfNums(5);
        System.out.println("Result: " + sum);
        //Expect 15

        sum = MyMath.sumOfNums(-3);
        System.out.println("Result: " + sum);
        //Expect 3

        int fact = MyMath.factorial(3);
        System.out.println("Answer: " + fact);
        //Expect 6

        fact = MyMath.factorial(1);
        System.out.println("Answer: " + fact);
        //Expect 1

        fact = MyMath.factorial(10);
        System.out.println("Answer: " + fact);
        //Expect 3628800

        if (MyMath.prime(3)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
        //Expect is a prime

        if (MyMath.prime(-20)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
        //Expect is not a prime


        //Q.2
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[100];
        int[] counter = new int[100];
        int i;
        int temp;
        System.out.println("Enter numbers between 1 and 100 (Enter 0 to exit): ");

        for (i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();

            if (num[i] == 0) {
                break;
            }
        }
        for (i = 0; i < num.length; i++) {
            temp = num[i];
            counter[temp]++;
        }
        for (i = 1; i < counter.length; i++) {

            if (counter[i] > 0 && counter[i] == 1) {
                System.out.print(i + "\t" + counter[i] + "\n");
            } else if (counter[i] >= 2) {
                System.out.print(i + "\t" + counter[i] + "\n");
            }
        }

        //Q.3
        int words = MyMath.countWords("A Star Is Born");
        System.out.println("\nNumber of words: " + words);
        //Expect 4

        words = MyMath.countWords("");
        System.out.println("Number of words: " + words);
        //Expect 0

        //Q.4
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Please enter a Password: ");
            password = input.next();
        } while (!MyMath.validate(password));

    }
}
