
package view;

import control.MapControl;
import model.Map;
import model.Location;

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
        //Map map = MapControl.createMap();
        // TODO displaying set map for now, in the future it will be called dynamically from createMap()
//        displayMap();
//        return "As the ruler of the City of Aaron,\n"
//                + "you have access to the city map and its secrets\n"
//                + "-----------------------------------------------------\n";
//                 
          return null;      


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

        //pause(1500);
        displayMap();
        return false;
    }
    
    public void displayMap() {
        Map map = MapControl.createMap();    
        Location[][] locations = map.getLocations();
        //locations[][] = map.locations;
        for (int i = 0; i < locations.length; i++) {

            for (int j = 0; j < locations[i].length; j++) {
                //System.out.println(map.getLocations[i][j].getMapSymbol());
                System.out.printf("%2s", j);
            }
            System.out.println();
        }
    }

}
