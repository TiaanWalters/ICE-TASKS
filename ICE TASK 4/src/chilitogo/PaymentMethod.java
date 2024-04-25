
package chilitogo;

import javax.swing.JOptionPane;


public class PaymentMethod 
{
   public static String choosePayment()
   {
       String[] buttons ={"Cash","Card"};
       int selection = JOptionPane.showOptionDialog(null,"Please choose you preffered payment method","Payment Method", 0,3,null,buttons,buttons[0]);
       
       if (selection==0)
       {
          return "Cash"; 
       }
       return "Card";
   }
    
}
