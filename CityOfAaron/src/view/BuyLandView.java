/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 *  @author shay
 */
public class BuyLandView extends ViewBase {
    
    /**
     * Constructor
     */
    public BuyLandView(){     
        //empty contructor     
    }
    
    @Override
    protected String getMessage() {
        return "\nBuy Land";   
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("How many acres of new land do you want buy?");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
        
        int acreNum = 0;
        boolean inputValid = false;

            try {
                acreNum = Integer.parseInt(inputs[0]);
            if (acreNum < 0) {
                System.out.println("Please enter a positive number.");
            } else {
                inputValid = true;
                saveAcersBought(acreNum);
            }
            } catch(NumberFormatException ex) {
                System.out.println("Please enter a number.");
            }
        
        return false;
    }
           
    private void saveAcersBought(int acreNum) {
        //stub function, to be completed after AnnualReport is implemented 
        System.out.println("\nLand purchased is saved\n"
                           + "Implentations coming soon\n"
                           + "*Returning To Manage Crop Menu\n");//TODO: call function to make sure the amount being bought can be afford, update, and save.
    }       

}
