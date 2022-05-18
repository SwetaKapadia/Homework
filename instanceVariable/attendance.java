package instanceVariable;


public class attendance {
    int year1;
    int year2;
    int year3;
    int year4;
    int year5;
    int year6;

    public static void main(String[] args) {
        attendance one = new attendance();
        attendance two = new attendance();
        attendance three = new attendance();
        attendance four = new attendance();
        attendance five = new attendance();

        one.year1 =30;
        one.year2 =29;
        one.year3 =26;
        one.year4 =29;
        one.year5 =30;
        one.year6 =24;

        two.year1=29;
        two.year2=24;
        two.year3=30;
        two.year4=27;
        two.year5=31;
        two.year6=22;

        three.year1=29;
        three.year2=30;
        three.year3=29;
        three.year4=26;
        three.year5=24;
        three.year6=30;

        four.year1=24;
        four.year2=29;
        four.year3=27;
        four.year4=30;
        four.year5=22;
        four.year6=31;

        five.year1=30;
        five.year2=29;
        five.year3=29;
        five.year4=24;
        five.year5=29;
        five.year6=24;


        System.out.println("All years attendance for Monday:");
        System.out.println("Year 1: "+one.year1);
        System.out.println("Year 2: "+one.year2);
        System.out.println("Year 3: "+one.year3);
        System.out.println("Year 4: "+one.year4);
        System.out.println("Year 5: "+one.year5);
        System.out.println("Year 6: "+one.year6);

        System.out.println("All years attendance for Tuesday:");
        System.out.println("Year 1: " + two.year1);
        System.out.println("Year 2: " + two.year2);
        System.out.println("Year 3: " + two.year3);
        System.out.println("Year 4: " + two.year4);
        System.out.println("Year 5: " + two.year5);
        System.out.println("Year 6: " + two.year6);

        System.out.println("All years attendance for Wednesday:");
        System.out.println("Year 1: " + three.year1);
        System.out.println("Year 2: " + three.year2);
        System.out.println("Year 3: " + three.year3);
        System.out.println("Year 4: " + three.year4);
        System.out.println("Year 5: " + three.year5);
        System.out.println("Year 6: " + three.year6);

        System.out.println("All years attendance for Thursday:");
        System.out.println("Year 1: " + four.year1);
        System.out.println("Year 2: " + four.year2);
        System.out.println("Year 3: " + four.year3);
        System.out.println("Year 4: " + four.year4);
        System.out.println("Year 5: " + four.year5);
        System.out.println("Year 6: " + four.year6);

        System.out.println("All years attendance for Friday:");
        System.out.println("Year 1: " + five.year1);
        System.out.println("Year 2: " + five.year2);
        System.out.println("Year 3: " + five.year3);
        System.out.println("Year 4: " + five.year4);
        System.out.println("Year 5: " + five.year5);
        System.out.println("Year 6: " + five.year6);
    }

}
