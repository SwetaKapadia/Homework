package week4;

public class Pattern2 {
    static void normalMethod(){
        String name[] = new String[5];
        name[0] = "*                 *                 *";
        name[1] = "* *              * *              * *";
        name[2] = "* * *           * * *           * * *";
        name[3] = "* * * *        * * * *        * * * *";
        name[4] = "* * * * *     * * * * *     * * * * *";

        for (int i = 0; i<5; i++){
            System.out.println(name[i]);
        }

    }

    public static void main(String[] args) {
        normalMethod();
    }



}
