package view;

/**
 *
 * @author bwicker
 */
public class TithesPercentView extends ViewBase {

    /**
     * Constructor
     */
    public TithesPercentView() {
        //empty constructor       
    }

    @Override
    protected String getMessage() {
        return "It is time to decide your tithing payment for the year.\n";
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
        inputs[0] = getUserInput("Enter a number that will be the percent of your harvest that you pay in tithing.");

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
        int int1 = 0;
        boolean inputValid = false;

        try {
            int1 = Integer.parseInt(inputs[0]);
            if (int1 < 0) {
                System.out.println("Please enter a positive number.");
            } else if (int1 > 100) {
                System.out.println("Please enter a number that is not greater than 100.");
            } else {
                inputValid = true;
                saveTithing(int1);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Please enter a number.");
        }

        return !inputValid;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private void saveTithing(int tithingPercent) {
        //TODO stub function, to be completed after AnnualReport is implemented 
        System.out.println("Saving tithing percent");
    }

}
