package control;

import model.Map;
import model.Game;
import model.Point;
import model.Location;

/**
 *
 * @author Brenda
 */
public class MapControl {

    public MapControl() {
        //empty constructor
    }

    public static Map createMap() {
        //create map object and assign values to it
        Map map = new Map();
        int noOfRows = 5;
        int noOfColumns = 5;

        //create a two-dimensional array of locations and assign array to the map
        Location[][] locations = new Location[noOfRows][noOfColumns];

        locations[0][0] = new Location("W", "Watchtower", "fill in a description", new String[]{});     
        locations[0][1] = new Location("W", "Watchtower", "fill in a description", new String[]{});
        locations[0][2] = new Location("W", "Watchtower", "fill in a description", new String[]{});
        locations[0][3] = new Location("W", "Watchtower", "fill in a description", new String[]{});
        locations[0][4] = new Location("W", "Watchtower", "fill in a description", new String[]{});

        locations[1][0] = new Location();
        locations[1][1] = new Location();
        locations[1][2] = new Location();
        locations[1][3] = new Location();
        locations[1][4] = new Location();

        locations[2][0] = new Location();
        locations[2][1] = new Location();
        locations[2][2] = new Location();
        locations[2][3] = new Location();
        locations[2][4] = new Location();

        locations[3][0] = new Location();
        locations[3][1] = new Location();
        locations[3][2] = new Location();
        locations[3][3] = new Location();
        locations[3][4] = new Location();

        locations[4][0] = new Location();
        locations[4][1] = new Location();
        locations[4][2] = new Location();
        locations[4][3] = new Location();
        locations[4][4] = new Location();
        
        map.setLocations(locations);
        
        Point point = new Point(2,3);
        map.setCurrentLocation(point);
        return map;
    }

}
