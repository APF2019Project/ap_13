package GameMod;
import view.Map;

public abstract class GameMode {
    void generateMap(){}
    boolean checkState(){
        return true;
    }
    void handleWin(){}
    void getHand(){}
}

class rail extends GameMode {

}

class zombie extends GameMode {

}
class water extends GameMode {

}
class day extends GameMode {

}