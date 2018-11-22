package view;

import java.util.Scanner;
import model.Storehouse;
import model.Author;
import cityofaaron.CityOfAaron;
import model.Game;
import model.InventoryItem;
import model.Animal;

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

        
        Game game = CityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getTheStorehouse();
        Animal[] animals = storehouse.getAnimals();
        
        if (animals == null) {
            System.out.println("There are no animals in the Storehouse.");
        } else {
            String animalName;
            int animalCount;
            int animalAge;
            for (Animal animal : animals) {
                animalName = animal.getName();
                animalCount = animal.getQuantity();
                animalAge = animal.getAge();
                System.out.println(animalCount + " " + animalName + ": " + animalAge + "-years-old");
            }
            int maxValue = animals[0].getAge();
            String name;
            for (int i=0; i< animals.length; i++) {
               if (animals[i].getAge()> maxValue) {
                   maxValue = animals[i].getAge();
                   name = animals[i].getName();
                   
                   System.out.println("\nYour " + name + " is the oldest animal\n"
                                    + "you have, at " + maxValue + "-years old.\n"
                                    + "Concider aquiring a new one\n");
               } 
            }  
        }
        saveReport();
    }

    private void toolsInStorehouse() {
        System.out.println("The tools of this game are:");

        
        Game game = CityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getTheStorehouse();
        InventoryItem[] tools = storehouse.getTools();
        
        if (tools == null) {
            System.out.println("There are no tools in the Storehouse.");
        } else {
            String toolName;
            int toolCount;
            for (int i = 0; i < tools.length; i++) {
                toolName = tools[i].getName();
                toolCount = tools[i].getQuantity();
                System.out.println(toolCount + " " + toolName);
            }
            long total = 0;
            for (InventoryItem tool : tools) {
                //put tool quantity into variable toolCount so can += with long total. 
                toolCount = tool.getQuantity(); 
                total += toolCount;
            }
            System.out.println("There is a total of " + total + " tools in the Storehouse.");
        }
        
        saveReport();
        //return null;
    }

    private void provisionsInStorehouse() {
        System.out.println("provisionsInStorehouse() called, implementation coming soon!\n");
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
