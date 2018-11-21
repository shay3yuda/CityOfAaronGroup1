
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
       
        // return false if you want this view to exit and return
        // to the view that called it.

        displayMap();
        return false;
    }
    
    public void displayMap() {
        System.out.println("As the ruler of the City of Aaron,");
        System.out.println("you have access to the city map and its secrets.");
        System.out.println("------------------------------");
        
        Map map = MapControl.createMap();    
        Location[][] locations = map.getLocations();

        for (int i = 0; i < locations.length; i++) {

            for (int j = 0; j < locations[i].length; j++) {
                System.out.printf("%3s", map.getLocations()[i][j].getMapSymbol());
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        System.out.println("C - Ruler's Court");
        System.out.println("S - City Granary and Storehouse");
        System.out.println("F - Wheat field");
        System.out.println("U - Undeveloped land");
        System.out.println("V - Village");
        System.out.println("R - River"); 
        System.out.println("B - Border of the Lamanite lands");
        System.out.println("T - Temple");
        System.out.println("W - Watchtower\n"); 
        pause(1500);
    }

}
