package view;

import control.GameControl;
import view.MainMenuView;

/**
 *
 * @author brenda
 */
public class GameMenuView extends ViewBase {

//    private void annualReportView() {
//        System.out.println("annualReportView() called. Implementation coming soon");
//        AnnualReportView annualReport = new AnnualReportView();
//        annualReport.displayView();
//    }
    /**
     * Constructor
     */
    public GameMenuView() {
        //empty constructor
    }
    
    @Override
    protected String getMessage() {
        return "Game Menu\n"
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
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
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
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.

        // return false if you want this view to exit and return
        // to the view that called it.
        switch (inputs[0].trim().toUpperCase()) {
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
     * Control this view's display/prompt/action loop until the user chooses and
     * action that causes this view to close.
     */
    @Override
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {
            getAnnualReport();

            if (GameControl.gameShouldEnd(0)) { //when fully implemented, this will contain mortality rate from annual report
                System.out.println("The game is ended. Details on your game status will be implemented later.");
                //TODO: create a specific message for the endgame
                return;
            }
            // get message that should be displayed
            // only print if it is non-null
            String message = getMessage();
            if (message != null) {
                System.out.println(getMessage());
            }
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }

    private void mapView() {
        System.out.println("mapView() called. Implementation coming soon"); //TODO mapView stub function needs to be fully implemented
    }

    private void moveNewLocation() {
        System.out.println("moveNewLocation() called. Implementation coming soon"); //TODO moveNewLocation stub function needs to be fully implemented
    }

    private void manageCrops() {
        ManageCropMenuView manageCropsMenu = new ManageCropMenuView();
        manageCropsMenu.displayView();
    }

    private void liveTheYear() {
        System.out.println("liveTheYear() called. Implementation coming soon"); //TODO liveTheYear stub function needs to be fully implemented
    }

    private void reportsMenu() {
        ReportsMenuView reportsMenu = new ReportsMenuView();
        reportsMenu.displayView();
    }

    private void saveGame() {
        SaveGameView saveGame = new SaveGameView();
        saveGame.displayView();
    }

    private void getAnnualReport() {
        //stub function
        System.out.println("Annual Report called. Implementation coming soon."); //TODO getAnnualReport stub function needs to be fully implemented
    }
}
