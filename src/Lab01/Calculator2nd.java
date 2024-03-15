/**This code is write to report the OOP Lab 01 - HUST 20232 - 738949
 * Task 2.2.6
 * Writer: Nguyen Sy Quan - 20225585
 */
package Lab01;
import java.lang.Math;
import java.util.Scanner;
public class Calculator2nd {
    public static void linearEquation(double a, double b){
        // ax+b=0
        if (a != 0){
            System.out.println("x = " + (-b/a));
            return;
        }
        if (b != 0){
            System.out.println("There is no value of x");
        }
        else{
            System.out.println("There are infinite value of x");
        }
    }
    public static void linearSystem(double a11, double a12, double a21, double a22, double b1, double b2){
        // a11x1 + a12x2 = b1
        // a21x1 + a22x2 = b2
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - b1 * a21;
        if (D == 0){
            if (D1 == 0 && D2 == 0){
                System.out.println("Equation has infinite root");
                return;
            }
            else{
                System.out.println("Equation has no root");
                return;
            }
        }
        else{
            System.out.println("Equation is: ");
            System.out.println("x1 = " + (D1/D));
            System.out.println("x1 = " + (D2/D));
        }
    }
    public static void quadEquation(double a, double b, double c){
        // ax^2 + bx + c = 0
        double delta = b*b - 4*a*c;
        if (delta > 0){
            System.out.println("Equation has 2 roots:");
            System.out.println("x1 = "+ ((-b-Math.sqrt(delta))/(2*a)));
            System.out.println("x1 = "+ ((-b+Math.sqrt(delta))/(2*a)));
        }
        if (delta == 0){
            System.out.println("Equation has double root: x = " + (-b/(2*a)));
        }
        else{
            System.out.println("Equation has no root");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your calculation: \n1.Linear Equation\n2.Linear System\n3.Quadratic Equation\nType below your choice");
        int userchoice = sc.nextInt();
        switch (userchoice){
            case 1:
                System.out.println("Formula as below:\nax + b = 0");
                System.out.print("Enter a: ");
                double a = sc.nextDouble();
                System.out.print("Enter b: ");
                double b = sc.nextDouble();
                linearEquation(a, b);
                break;
            case 2:
                System.out.println("Formula as below:\na11x1 + a12x2 = b1\na21x1 + a22x2 = b2");
                System.out.print("Enter a11: ");
                double a11 = sc.nextDouble();
                System.out.print("Enter a12: ");
                double a12 = sc.nextDouble();
                System.out.print("Enter a21: ");
                double a21 = sc.nextDouble();
                System.out.print("Enter a22: ");
                double a22 = sc.nextDouble();
                System.out.print("Enter b1: ");
                double b1 = sc.nextDouble();
                System.out.print("Enter b2: ");
                double b2 = sc.nextDouble();
                linearSystem(a11, a12, a21, a22, b1, b2);
                break;
            case 3:
                System.out.println("Formula as below:\nax^2 + bx + c = 0");
                System.out.print("Enter a: ");
                double a3 = sc.nextDouble();
                System.out.print("Enter b: ");
                double b3 = sc.nextDouble();
                System.out.print("Enter c: ");
                double c3 = sc.nextDouble();
                quadEquation(a3, b3, c3);
                break;
        }
        sc.close();
    }
}
