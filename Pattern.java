package week4;

public class Pattern {
    static void normalMethod() {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

    }

    static void method2() {
        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  * * *");
        System.out.println(" * * * *");
        System.out.println("* * * * *");
    }

    void method3() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");

    }

    public static void main(String[] args) {
        normalMethod();
        method2();
        Pattern left = new Pattern();
        left.method3();
    }
}
