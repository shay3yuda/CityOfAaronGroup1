/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author estherhsia
 */
public class MapView extends ViewBase {
    
    public MapView() {
        // empty constructor
    }
    
    @Override
    protected String getMessage() {
        
        // TODO displaying set map for now, in the future it will be called dynamically from createMap()
        return "As the ruler of the City of Aaron,\n"
                + "you have access to the city map and its secrets\n"
                + "-----------------------------------------------------\n"
                + "[W] [F] [R] [F] [U] [W]\n"
                + "[B] [V] [R] [F] [V] [F]\n"
                + "[B] [V] [R] [T] [F] [V]\n"
                + "[B] [F] [S] [R] [V] [F]\n"
                + "[B] [R] [F] [F] [R] [U]\n"
                + "[W] [R] [U] [V] [R] [W]\n"
                + "C - Rulers Court\n"
                + "S - City's Granary and Storehouse\n"
                + "F - Wheat Fields\n"
                + "U - Undeveloped Land\n"
                + "V - the Village\n"
                + "R - the River\n"
                + "B - Border of the Lamanites land\n"
                + "T - the Temple\n"
                + "W - Watchtower\n";
    }
    
    /**
     * Get the set of inputs from the user.
     * @return
     */
    @Override
    public String[] getInputs() {
        
        // this view is not interactive, all it does is show the game description
        return null;
        
    }
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        
        // return false if you want this view to exit and return
        // to the view that called it.
        pause(1500);
        
        return false;
    }
}
