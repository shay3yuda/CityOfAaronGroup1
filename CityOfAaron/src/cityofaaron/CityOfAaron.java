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
        try {
            View startProgramView = new StartProgramView();
            startProgramView.displayView();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
        }
    }

}
