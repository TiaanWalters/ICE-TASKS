
package countwords;

import javax.swing.JOptionPane;
public class CountWords {

   
    public static void main(String[] args)
    {      
      String input = JOptionPane.showInputDialog("Please enter the string");       
      JOptionPane.showMessageDialog(null,"There are "+countWords(input)+" words in the given string");                
    } 
    public static int countWords(String input)
       {
           String[] splitWords = input.split("[\\s,.;?!-]+");
           return splitWords.length;
       }
}
