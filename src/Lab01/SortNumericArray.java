/**This code is write to report the OOP Lab 01 - HUST 20232 - 738949
 * Task 6.5
 * Writer: Nguyen Sy Quan - 20225585
 */
package Lab01;
import java.util.Arrays;
import java.util.Scanner;
public class SortNumericArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your choice: \n1.Enter array\n2.Use constants available array\nYour choice: ");
        int userchoice = sc.nextInt();
        sc.nextLine();
        int[] arr;
        switch (userchoice){
            case 1:
                arr = getArr(sc);
                break;
            case 2:
                arr = new int[]{3, 6, 54, 54, 3, 7, 74};
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }
        Arrays.sort(arr);

        int sum = 0;
        for (int num: arr){
            sum += num;
        }
        
        double average =(double) sum / arr.length;

        System.out.println("Sorted array is: " + Arrays.toString(arr));
        System.out.println("Sum of array is: " + sum);
        System.out.println("Average of array is: " + average);
        sc.close();
    }
    public static int[] getArr(Scanner sc){
        System.out.println("Please type size of array: ");
        int sizeofarray = sc.nextInt();
        sc.nextLine();
        int[] outputarray = new int[sizeofarray];
        for (int i = 0; i < sizeofarray; i++){
            System.out.println("Type array[" + i + "]: ");
            outputarray[i] = sc.nextInt();
            sc.nextLine();
        }
        return outputarray;
    }
}
