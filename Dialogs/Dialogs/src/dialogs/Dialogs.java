
package dialogs;
import javax.swing.JOptionPane;

/**
 *
 * @author lfv5020
 */
public class Dialogs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + name);
        */
        String ans = JOptionPane.showInputDialog(null, "What is 2+2?", "Math", JOptionPane.QUESTION_MESSAGE);
        
        if(ans.equals("4"))
            JOptionPane.showMessageDialog(null, "That is correct", "Result",
                                            JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "That is incorrect", "Result",
                                          JOptionPane.ERROR_MESSAGE);
        
        
        
        
    }
    
}
