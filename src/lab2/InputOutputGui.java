package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String name = "";
        try{
        //name = nameService.extractLastName(fullName);
  
        String msg = "Your first name is: " + nameService.getNameLength(fullName);
        JOptionPane.showMessageDialog(null, msg);
        } catch(IllegalArgumentException iae){
            JOptionPane.showMessageDialog(null, iae);
        }
    }
     
}
