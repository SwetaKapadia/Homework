package instanceVariable;

public class prices {
    int laundryLiquid;
    int dishSoap;
    int gloves;

    public static void main(String[] args) {
        prices cleaning = new prices();
        cleaning.laundryLiquid=5;
        cleaning.dishSoap=2;
        cleaning.gloves=1;
        System.out.println("Price of gloves: £"+cleaning.gloves);
    }
}
