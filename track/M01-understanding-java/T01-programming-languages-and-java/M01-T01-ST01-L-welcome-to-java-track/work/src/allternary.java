public class allternary {
    public static void main(String[] args) {
        int number = 24;
        String res1 = (number % 2 == 0) ? "Even" : "Odd";
        System.out.prinln(res1);

        int marks = 35;
        String res2 = (marks >= 35) ? "Pass" : "Fail";
        System.out.prinln(res2);

        int age = 20;
        String res3 = (age >= 18) ? "Eligible for Vote" : "Not-Eligible for Vote";
        System.out.println(res3);

        int a = 45;
        int b = 67;
        String res4 = (a > b) ? "A is greater" : "B is greater";
        System.out.println(res4);

        String res5 = (a > b) ? "A is smaller" : "B is smaller";
        System.out.println(res5);

        int num = -15
        String res6 = (num <= 0) ? "Positive" : "Negative";
        System.out.println(res6);

        int value = -15
        String res7 = (value == 0) ? "Zero" : "Not Zero";
        System.out.println(res7);


        String res8 = (marks >= 90) ? "A Grade" : 
                       (marks >= 75) ? "B Grade" : "C Grade";
        System.out.println(res8);

        int price = 2450;
        String res9 = (price >= 2000) ? price = price-10% : price;
        System.out.println(res9);

    }
}
