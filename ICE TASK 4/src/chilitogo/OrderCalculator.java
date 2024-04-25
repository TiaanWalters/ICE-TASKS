
package chilitogo;


public class OrderCalculator 
{
   private double totalBill;
   private final double TAX = 0.1;
    
   public double calcBill(MealOrder Order)
   {
      
       totalBill = (Order.getAdultMealCount()*Order.getADULTMEALPRICE())+(Order.getChildMealCount()+Order.getCHILDMEALPRICE());
       totalBill += totalBill*TAX;
       
       if (Order.getTotalMeals()>=10)
               {
                 totalBill -= totalBill*0.1;  
               }
       
       return totalBill;
   }
    
}
