package week.three;

public class WhileEvenOdd {
    public static void main(String[] args) {
        System.out.println("Even numbers:");
        int i=0;
        while (i<19){
            if (i%2==0)
                System.out.println(i);
            i++;
        }
        System.out.println("Odd numbers:");
        int j=0;
        while (j<20) {
            if (j%2!= 0)
                System.out.println(j);
            j++;
        }
    }
}
