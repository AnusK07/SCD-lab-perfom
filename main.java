import java.util.Scanner;

class NumberCheck {

    void checkEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an EVEN number.");
        } else {
            System.out.println(num + " is an ODD number.");
        }
    }

    void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is NOT a Prime number.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a PRIME number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberCheck obj = new NumberCheck();

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        obj.checkEven(number);
        obj.checkPrime(number);

        sc.close();
    }
}
