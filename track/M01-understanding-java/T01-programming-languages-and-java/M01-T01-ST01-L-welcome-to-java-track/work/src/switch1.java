public class switch1 {
    public static void main(String[] args) {
     int marks = 100;
     switch(marks) {
        case 100, 99, 98:
            System.out.println("pass");
            break;
        case 35, 36:
            System.out.println("avg");
            break;
        default:
            System.out.println("fail");
     }
    }
}
