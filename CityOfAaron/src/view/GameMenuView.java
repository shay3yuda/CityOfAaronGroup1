
package view;

import java.util.Scanner;
import control.GameControl;
import view.MainMenuView;

/**
 *
 * @author brenda
 */
public class GameMenuView {
    
//    private void annualReportView() {
//        System.out.println("annualReportView() called. Implementation coming soon");        
//    AnnualReportView annualReport = new AnnualReportView();
//    annualReport.displayView();
//    }

    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public GameMenuView(){
        
        message ="Game Menu\n"
                + "----------------------\n"
                + "V - View the Map\n"
                + "L - Move to a new Location\n"
                + "C - Manage the Crops\n"
                + "Y - Live the Year\n"
                + "R - Reports Menu\n"
                + "S - Save Game\n"
                + "M - Return to the Main Menu\n";
                
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
        
        inputs[0] = getUserInput("What would you like to do?");
        
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
        switch(inputs[0].trim().toUpperCase()){
            case "V":
                mapView();
                break;   
            case "L":
                moveNewLocation();
                break;
            case "C":
                manageCrops();
                break;
            case "Y":
                liveTheYear();
                break;   
            case "R":
                reportsMenu();
                break;
            case "S":
                saveGame();
                break;                
            case "M":
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
            System.out.println("Annual Report called. Implementation coming soon.");
//          System.out.println(GameControl.getLiveTheYear);   


            //pause for a couple of seconds            
            try {
              Thread.sleep(2000);
            }
             catch(InterruptedException exception) {
              //ignore for now
            }
            if (GameControl.gameShouldEnd(0)) { //when fully implemented, this will contain mortality rate from annual report
                System.out.println("More than 50% of your population died, therefore this game is over. Repent and try again.");
            //    startOver();
            } else {
                System.out.println(message);
                String[] inputs = getInputs();
                keepGoing = doAction(inputs);
            }
        }
    }
    
 
    private void mapView() {
        System.out.println("mapView() called. Implementation coming soon");
    }
    
    private void moveNewLocation() {
        System.out.println("moveNewLocation() called. Implementation coming soon");
    }
    
    private void manageCrops() {
        ManageCropMenuView manageCropsMenu = new ManageCropMenuView();
        manageCropsMenu.displayView();
    }
    
    private void liveTheYear() {
        System.out.println("liveTheYear() called. Implementation coming soon");
    }
    
    private void reportsMenu() {
        ReportsMenuView reportsMenu = new ReportsMenuView();
        reportsMenu.displayView();
    }
    
    private void saveGame() {
        SaveGameView saveGame = new SaveGameView();
        saveGame.displayView();
    }
      
    private void startOver() {
        StartProgramView startOver = new StartProgramView();
        startOver.displayView();
    }
}
