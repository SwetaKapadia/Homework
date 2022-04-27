package week.three;

public class ForLoopOne {
    public static void main(String[] args) {
        System.out.println("Ten even numbers:");
        for(int i=0; i<19; i++){
            if (i%2==0)
            System.out.println(i);
        }
        System.out.println("Ten odd numbers:");
        for(int i=0; i<20; i++){
            if (i%2!=0)
            System.out.println(i);
        }

    }
}
