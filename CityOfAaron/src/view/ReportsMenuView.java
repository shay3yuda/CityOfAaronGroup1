package view;

import model.Storehouse;
import model.Author;
import cityofaaron.CityOfAaron;
import model.Game;
import model.InventoryItem;
import model.Animal;
import model.Provision;
import control.StorehouseControl;
import exceptions.StorehouseControlException;

/**
 *
 * @author estherhsia
 */
public class ReportsMenuView extends ViewBase {

    /**
     * Constructor
     */
    public ReportsMenuView() {
        // empty constructor
    }

    @Override
    protected String getMessage() {
        return "Reports Menu\n"
                + "-----------------------\n"
                + "A - View the animals in the storehouse\n"
                + "T - View the tools in the storehouse\n"
                + "P - View the provisions in the storehouse\n"
                + "G - View the authors of this game\n"
                + "Q - Return to Game Menu\n";
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

        inputs[0] = getUserInput("Which report would you like to view?");

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

    private void animalsInStorehouse() {
        System.out.println("The Animlas in this game are:");

        StorehouseControl.animalList();

        saveReport();
    }

    private void toolsInStorehouse() {
        System.out.println("The tools of this game are:");
        try {
            StorehouseControl.toolList();
        } catch (StorehouseControlException ex) {
            System.out.println(ex.getMessage());
        }
        saveReport();
    }

    private void provisionsInStorehouse() {

        System.out.println("The provisions you have are:");

        Provision[] provisions = CityOfAaron.getCurrentGame().getTheStorehouse().getProvisions();

        int provisionCount;
        String provisionName;
        for (Provision provision : provisions) {
            provisionCount = provision.getQuantity();
            provisionName = provision.getName();
            System.out.println(provisionName + ", " + provisionCount);
        }
        
        StorehouseControl.provisionList();

        saveReport();
    }

    private Author authorsOfGame() {

        System.out.println("The authors of this game are:");

        Game game = CityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getTheStorehouse();
        Author[] authors = storehouse.getAuthors();

        for (int i = 0; i < authors.length; i++) {

            System.out.println(authors[i].getName());

        }
        System.out.println();
        saveReport();
        return null;
    }

    private void saveReport() {

        String[] inputs = new String[1];

        inputs[0] = getUserInput("Do you want to save report to file?\n"
                + "Y - Yes\n"
                + "N - No\n");

        switch (inputs[0].trim().toUpperCase()) {
            case "Y":
                System.out.println("GameControl.saveReportToFile() called, implementation coming soon.\n");
                break;
            case "N":
                displayView();
                break;

        }
    }
}
