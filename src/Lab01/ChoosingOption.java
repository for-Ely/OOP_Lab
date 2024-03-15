/**This code is write to report the OOP Lab 01 - HUST 20232 - 738949
 * Task 6.1
 * Writer: Nguyen Sy Quan - 20225585
 */
package Lab01;
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        //Object[] options = {"I know", "I don't know", "Yes"};
        //int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION? "Yes":"No"));
        System.exit(0);
    }
}