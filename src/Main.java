public class Main {
    public static void main(String[] args) {
        short year = 2108 ;
        float year400 = year % 400 ;
        float year100 = year % 100 ;
        float year4 = year % 4 ;

    if (year400 == 0) {
        System.out.println(year + " год является високосным");
    } else if (year100 == 0) {
        System.out.println(year + " год не является високосным");
    } else if (year4 == 0) {
        System.out.println(year + " год является високосным");
    } else {
        System.out.println(year + " год не является високосным");
    }}}