/**This code is write to report the OOP Lab 01 - HUST 20232 - 738949
 * Task 2.2.4
 * Writer: Nguyen Sy Quan - 20225585
 */
package Lab01;
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
	public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You're just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and " ;
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
