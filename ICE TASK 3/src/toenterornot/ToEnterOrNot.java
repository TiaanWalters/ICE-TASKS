//test 123
package toenterornot;
import javax.swing.JOptionPane;
public class ToEnterOrNot {

    public static void main(String[] args) 
    {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
        
        if (age<18)
        {
            JOptionPane.showMessageDialog(null, "You are too young, entry denied");
            System.exit(0);
        }
        else if (age>=35)
        {
            JOptionPane.showMessageDialog(null, "You are too old, entry denied");
            System.exit(0);
        }
        else
        {
            int numMales = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many men are in your group"));
            
            String welcome = "Welcome in!";
            
            if (numMales>0)
            {
                welcome = welcome+"\nFee to be paid: R"+numMales*10;
            }
            
            JOptionPane.showMessageDialog(null, welcome);
        }
        
    }
    
}
