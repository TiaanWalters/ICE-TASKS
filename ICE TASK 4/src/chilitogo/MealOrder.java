
package chilitogo;


public class MealOrder 

{
private int childMealCount,adultMealCount,totalMeals;
 
    public MealOrder(int childMealCount, int adultMealCount) {
        this.childMealCount = childMealCount;
        this.adultMealCount = adultMealCount;
        totalMeals =childMealCount+adultMealCount;
        
    }

    
    
    
    
   private final int ADULTMEALPRICE = 7;
   private final int CHILDMEALPRICE = 4;
    public int getADULTMEALPRICE() {
        return ADULTMEALPRICE;
    }

    public int getCHILDMEALPRICE() {
        return CHILDMEALPRICE;
    }
   
   

    public int getChildMealCount() {
        return childMealCount;
    }

    public void setChildMealCount(int childMealCount) {
        this.childMealCount = childMealCount;
    }

    public int getAdultMealCount() {
        return adultMealCount;
    }

    public void setAdultMealCount(int adultMealCount) {
        this.adultMealCount = adultMealCount;
    }
    
    public int getTotalMeals() {
        return totalMeals;
    }

    public void setTotalMeals(int totalMeals) {
        this.totalMeals = totalMeals;
    }
}
