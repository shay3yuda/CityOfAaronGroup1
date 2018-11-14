
package view;

/**
 *
 * @author Shay
 */
public class LoadGameView extends ViewBase {
    
    /**
     * Constructor
     */
    public LoadGameView(){
        //Empty contructor        
    }
    
    @Override
    protected String getMessage () {
        return "Load a Saved Game.\n";
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
        
        inputs[0] = getUserInput("Enter the name of the Saved your game\n"
                                    + "\t\t-OR-\n"
                                    + "Press Enter to return to the Main Menu", true);
        
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
        
         if(inputs[0] == null || inputs[0].equals("")) {
            System.out.println("No Game Name entered; returning to the Main Menu\n");
            return false;
        }
        
        String gameName = inputs[0];
        loadSavedGameFromName(gameName);
        
        return false;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private void loadSavedGameFromName(String gameName){
      //not sure if the function is called correctly...
        //loadGameFromFile(gameName);
        
        System.out.println("\nloadGameFromFile() called, implementation coming soon.\n");
      
    }
}

