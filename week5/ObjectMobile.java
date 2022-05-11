package week5;

public class ObjectMobile {
    String brand;
    int price;

    public static void main(String[] args){
    ObjectMobile a = new ObjectMobile();
    ObjectMobile b = new ObjectMobile();
    ObjectMobile c = new ObjectMobile();

    a.brand = "Apple iPhone";
    a.price = 900;

    b.brand = "Samsung Galaxy";
    b.price = 1000;

    c.brand = "One Plus";
    c.price = 800;

        System.out.println(a.brand);
        System.out.println(a.price);

        System.out.println(b.brand);
        System.out.println(b.price);

        System.out.println(c.brand);
        System.out.println(c.price);
    }
}
