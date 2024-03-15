/**This code is write to report the OOP Lab 01 - HUST 20232 - 738949
 * Task 6.4
 * Writer: Nguyen Sy Quan - 20225585
 */
package Lab01;
import java.util.Scanner;
public class DayInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Type month: ");
        String month = sc.nextLine();
        switch(getMonth(month)){
            case -1:
                System.out.println("You type wrong format of month");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month has 31 days");
                break;
            case 2:
                if (year >= 0){
                    if (isLeapYear(year)){
                        System.out.println("Month has 29 days");
                        break;
                    }
                    System.out.println("Month has 28 days");
                    break;
                }
                System.out.println("You typed invalid year");
                break;
            default:
                System.out.println("Month has 30 days");

        }
    }
    public static int getMonth(String month){
            switch (month){
                case "January":
                case "Jan.":
                case "Jan":
                case "1":
                    return 1;
                case "February":
                case "Feb.":
                case "Feb":
                case "2":
                    return 2;
                case "March":
                case "Mar.":
                case "Mar":
                case "3":
                    return 3;
                case "April":
                case "Apr.":
                case "Apr":
                case "4":
                    return 4;
                case "May":
                case "5":
                    return 5;
                case "June":
                case "Jun.":
                case "Jun":
                case "6":
                    return 6;
                case "July":
                case "Jul":
                case "7":
                    return 7;
                case "August":
                case "Aug.":
                case "Aug":
                case "8":
                    return 8;
                case "September":
                case "Sept.":
                case "Sept":
                case "9":
                    return 9;
                case "October":
                case "Oct.":
                case "Oct":
                case "10":
                    return 10;
                case "November":
                case "Nov.":
                case "Nov":
                case "11":
                    return 11;
                case "December":
                case "Dec.":
                case "Dec":
                case "12":
                    return 12;
                default:
                    return -1;
            }    
    }
    public static boolean isLeapYear(int year){
        if (year % 4 == 0){
            if ((year % 100 == 0) && (year % 400 != 0)){
                return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
}