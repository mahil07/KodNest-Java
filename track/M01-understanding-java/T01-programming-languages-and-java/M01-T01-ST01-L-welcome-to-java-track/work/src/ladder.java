public class ladder {
    public static void main(String[] args) {
        String customerName = "Rahul";
        int unitsConsumed = 350;
        int perunit = 0;
        if (unitsConsumed >= 0 && unitsConsumed <= 100) {
            perunit = 2;
        } else if (unitsConsumed >= 101 && unitsConsumed <= 200) {
            perunit = 3;
        } else if (unitsConsumed >= 201 && unitsConsumed <= 300) {
            perunit = 5;
        } else if (unitsConsumed >= 300) {
            perunit = 7;
        } else {
            System.out.println("Invaild units");
        }

        double surcharge;
        double ebill = unitsConsumed * perunit;
        if (ebill >= 1000) {
            surcharge = ebill * 0.5;
        } else {
            surcharge = 0.0;
        }

        double totalbill = ebill + surcharge;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity bill: " + ebill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Totalbill " + totalbill);
    }
}
