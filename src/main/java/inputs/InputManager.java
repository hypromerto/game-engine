package inputs;

public class InputManager {

    public static InputManager inputManager;

    private InputManager() {}

    public static InputManager getInstance(){
        if (inputManager == null){
            inputManager = new InputManager();
        }

        return inputManager;
    }

    public void handleInput(){

    }
}
