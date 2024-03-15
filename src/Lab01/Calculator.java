package Lab1;
import javax.swing.JOptionPane;
public class Calculator {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double douNum1, douNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please type the first number", "Get first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please type the second number", "Get second number", JOptionPane.INFORMATION_MESSAGE);
        douNum1 = Double.parseDouble(strNum1);
        douNum2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, "Sum of them is: "+(douNum1+douNum2), "Sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Difference of them is: " + (douNum1-douNum2), "Difference", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Product of them is: " + (douNum1*douNum2), "Product", JOptionPane.INFORMATION_MESSAGE);
        if (douNum2 != 0){
            JOptionPane.showMessageDialog(null, "Quotient of them is: " + (douNum1/douNum2), "Quotient", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Devisor is not allow to be 0", "Quotient", JOptionPane.INFORMATION_MESSAGE);
            
        }
        System.exit(0);
    }
}
