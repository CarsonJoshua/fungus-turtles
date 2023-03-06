import javax.swing.*;

public class Game extends JPanel {
    final static int GAME_WIDTH = 100;
    final static int GAME_HEIGHT = 100;
    final static int TILE_WIDTH = 5;
    final static int TILE_HEIGHT = 5;
    final static int STARTING_SPORES = 3;
    final static int STARTING_TURTLES = 1;
    final static int TURTLE_STARTING_HEALTH = 20;
    final static int TURTLE_MIN_TIREDNESS = 1;
    final static int TURTLE_MAX_TIREDNESS = 5;
    final static int TURN_TIME = 500;//TODO make turn time more reliable instead of just waiting between processes
    final static boolean INFINITE = true;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
//        frame.setSize((GAME_WIDTH+1)*TILE_WIDTH, (GAME_HEIGHT+4)*TILE_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Game game = new Game();
        frame.add(game);
        frame.setVisible(true);
        game.beginGameCycle();
    }

    public Game(){
        setSize(GAME_WIDTH, GAME_HEIGHT);
    }
    void beginGameCycle(){

    }
}