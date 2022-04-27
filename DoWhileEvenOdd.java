package week.three;

public class DoWhileEvenOdd {
    public static void main(String[] args) {
        System.out.println("Even numbers:");
        int a = 0;
        do {
            if (a%2==0)
            System.out.println(a);
                a++;
            } while (a<19);

        System.out.println("Odd numbers:");
        int b = 0;
        do {
            if (b % 2 != 0)
                System.out.println(b);
            b++;
        } while (b<20);
        }
    }



