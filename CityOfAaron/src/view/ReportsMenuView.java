package view;

import java.util.Scanner;


/**
 *
 * @author estherhsia
 */
public class ReportsMenuView {
    
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public ReportsMenuView() {
        
        message = "Reports Menu\n"
                + "-----------------------\n"
                + "A - View the animals in the storehouse\n"
                + "T - View the tools in the storehouse\n"
                + "P - View the provisions in the storehouse\n"
                + "G - View the authors of this game\n"
                + "Q - Return to Game Menu\n";
                
    }
    
    
    /**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;
        
        while(inputReceived == false){
            
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            // Make sure we avoid a null-pointer error.
            if (input == null){
                input = "";
            }
            
            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputReceived = true;
            }
        }
        
        return input;
    }
    
    
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we don't have 
     * to type it ourselves.
     * @param prompt
     * @return 
     */
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Which report would you like to view?");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs){
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        
        // return false if you want this view to exit and return
        // to the view that called it.
        switch(inputs[0].trim().toUpperCase()) {
            case "A":
                animalsInStorehouse();
                break;   
            case "T":
                toolsInStorehouse();
                break;
            case "P":
                provisionsInStorehouse();
                break;
            case "G":
                authorsOfGame();
                break;
            case "Q":
                System.out.println("Returning to Game Menu\n");
                return false;
        } 
        
        return true;
    }
    
    
    /**
     * Control this view's display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     */
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    private void animalsInStorehouse() {
        System.out.println("animalsInStorehouse() called, implementation coming soon!\n");
        saveReport();
    }
    
    private void toolsInStorehouse() {
        System.out.println("toolsInStorehouse() called, implementation coming soon!\n");
        saveReport();
    }
    
    private void provisionsInStorehouse() {
        System.out.println("provisionsInStorehouse() called, implementation coming soon!\n");
        saveReport();
    }
    
    private void authorsOfGame() {
        System.out.println("authorsOfGame() called, implementation coming soon!\n");
        saveReport();
    }
    
    private void saveReport() {
      
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Do you want to save report to file?\n"
                + "Y - Yes\n"
                + "N - No\n");
        
        switch(inputs[0].trim().toUpperCase()) {
            case "Y":
                System.out.println("GameControl.saveReportToFile() called, implementation coming soon.\n");
                break;   
            case "N":
                displayView();
                break;

        }    
    }
}

