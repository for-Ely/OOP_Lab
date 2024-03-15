/**This code is write to report the OOP Lab 01 - HUST 20232 - 738949
 * Task 6.1
 * Writer: Nguyen Sy Quan - 20225585
 */
package Lab01;
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION? "Yes":"No"));
        System.exit(0);
    }
}