public class Turtle {
    final static int MIN_TIREDNESS = Game.TURTLE_MIN_TIREDNESS;
    final static int MAX_TIREDNESS = Game.TURTLE_MAX_TIREDNESS;
    Location loc;
    int nutrition, tiredness;

    //BEHAVIORS
    TirednessDecider tirednessDecider;
    MoveDecider moveDecider;

    public Turtle(Location loc, TirednessDecider tirednessDecider, MoveDecider moveDecider) {
        this.loc = loc;
        this.tirednessDecider = tirednessDecider;
        this.moveDecider = moveDecider;
        nutrition = Game.TURTLE_STARTING_HEALTH;
        tiredness = MIN_TIREDNESS;
    }

    public class Egg{
        boolean fertilized;
        Location loc;
        TirednessDecider tirednessDecider;
        MoveDecider moveDecider;

        public Egg(Turtle parent){
            fertilized = false;
            loc=parent.loc.copy();
            tirednessDecider = parent.tirednessDecider;
            moveDecider = parent.moveDecider;
        }
        public void fertilize(Turtle parent){
            if(fertilized)return;
            if(Math.random()>.5)tirednessDecider = parent.tirednessDecider;
            if(Math.random()>.5)moveDecider = parent.moveDecider;
        }
        public Turtle hatch(){
            return new Turtle(loc, tirednessDecider, moveDecider);
        }

    }
    public interface TirednessDecider{
        public boolean active(int nutrition, int tiredness);
    }
    public interface MoveDecider{
        public Direction move(int nutrition, int tiredness)
    }
}
