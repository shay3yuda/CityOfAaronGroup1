package cityofaaron;

import model.Game;
import view.View;
import view.StartProgramView;
       

public class CityOfAaron {

    //keep a copy of the current game Object in the main class   
    public static Game currentGame = null;
    
    public static Game getCurrentGame() {
        return currentGame;
}
    
    public static void setCurrentGame(Game game) {
        currentGame = game;
    } 

    public static void main(String[] args) {
           
        View startProgramView = new StartProgramView();
        startProgramView.displayView();
    }

}
