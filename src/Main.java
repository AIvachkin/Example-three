public class Main {
    public static void main(String[] args) {
        short deliveryDistance = 95 ;
        short distance1Day = 20 ;
        short distance2Day = 60 ;
        short distance3Day = 100 ;
    if (deliveryDistance <= distance1Day) {
        System.out.println("Потребуется дней: 1");
    } else if (deliveryDistance <= distance2Day) {
        System.out.println("Потребуется дней: 2");
    } else {
        System.out.println("Потребуется дней: 3");

    }}}