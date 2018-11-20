/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.Point;
/**
 *
 * @author estherhsia
 */
public class NewLocationView extends ViewBase {
    
    /**
     * Constructor
     */
    public NewLocationView() {
        // empty constructor
    }
    
    @Override
    protected String getMessage() {
        return "\nMoving to a new location";
    }
    
    /**
     * Get the set of inputs from the user.
     * @return
     */
    @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend
        // to get from user
        String[] inputs = new String[2];
        
        inputs[0] = getUserInput("Enter the column coordinate you wish to move to:");
        inputs[1] = getUserInput("Enter the row coordinate you wish to move to:");
        
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
      
        // call setCurrentLocation() to set current location in the map
        int column = 0;
        int row = 0;
        boolean inputValid = false;

        try {
            column = Integer.parseInt(inputs[0]);
            row = Integer.parseInt(inputs[1]);
            if (column < 0 || row < 0) {
                System.out.println("\nPlease enter only positive numbers.\n");
            } else if (column > 6 || row > 6) {
                System.out.println("\nPlease enter numbers that are not greater than 6.\n");
            } else {
                inputValid = true;
                moveToNewLocation(column, row);
            }
        } catch (NumberFormatException ex) {
            System.out.println("\nPlease enter a number.\n");
        }

        return !inputValid;
    }
    
    private void moveToNewLocation(int column, int row) {
        
        Point point = new Point();
        point.setColumn(column);
        point.setRow(row);
        
        //TODO call setCurrentLocation() then return name of coordinates, description and hints
        System.out.println("\nsetCurrentLocation() called.\n");
    }
       
}
