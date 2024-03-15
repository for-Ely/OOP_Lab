/**This code is write to report the OOP Lab 01 - HUST 20232 - 738949
 * Task 6.6
 * Writer: Nguyen Sy Quan - 20225585
 */
package Lab01;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
public class AddMatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your choice: \n1.Enter array\n2.Use constants available array\nYour choice: ");
        int userchoice = sc.nextInt();
        sc.nextLine();
        int[] arr1, arr2;
        switch (userchoice){
            case 1:
                arr1 = getArr(sc);
                arr2 = getArr(sc);
                break;
            case 2:
                arr1 = new int[]{3, 6, 54, 54, 3, 7, 74};
                arr2 = new int[]{3, 6, 54, 54, 3, 7, 74};
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }
        if (arr1.length == arr2.length){
            System.out.println(arr1.length);
            int[] resultarr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++){
                resultarr[i] = arr1[i] + arr2[i];
            }
            System.out.println("Sum of two matrice is: " + Arrays.toString(resultarr));
        }
        else{
            System.out.println("You typed 2 difference type of matrice");
        }
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