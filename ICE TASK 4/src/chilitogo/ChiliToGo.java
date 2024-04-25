package chilitogo;
import javax.swing.JOptionPane;
public class ChiliToGo 
{
    public static void main(String[] args) 
    {
       boolean exitFlag = false;
       
    
       int adultMealNum,childMealNum;
       
       String[] buttons ={"Order","Menu","Exit"};
       
     while(!exitFlag)
     {
       
       int selection = JOptionPane.showOptionDialog(null,"Would you like to order or view our menu?","Welcome!", 0,3,null,buttons,buttons[0]);
       
       switch (selection)
       {
           case 0: 
              do
              {
                  
              childMealNum =  Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of children's meals you want to order"));
              adultMealNum =  Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of adult's meals you want to order"));
              
                  if ((childMealNum<0)||(adultMealNum<0))
                      {
                        JOptionPane.showMessageDialog(null, "Meals cannot be nagative! Please try again");
                      }
               
              }while((childMealNum<0)||(adultMealNum<0));
               
               MealOrder Order = new MealOrder(childMealNum,adultMealNum);
               
               String payMethod = PaymentMethod.choosePayment();
               
               OrderCalculator Calcker = new OrderCalculator();
               
               double bill = Calcker.calcBill(Order);
               
               JOptionPane.showMessageDialog(null, "YOUR ORDER:\nChildren's Meals: "+childMealNum+"\nAdult's Meals: "+adultMealNum+"\nPayment Method: "+payMethod+"\nTotal amount due: $"+bill);
               exitFlag =true;
               
               break;
           case 1:
               Menu.displayMenu();
               break;
           case 2:
               exitFlag = true;
              
       }
     }
           
         
               
       
        
    }

}
