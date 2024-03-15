/**This code is write to report the OOP Lab 01 - HUST 20232 - 738949
 * Task 6.3
 * Writer: Nguyen Sy Quan - 20225585
 */
package Lab01;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}