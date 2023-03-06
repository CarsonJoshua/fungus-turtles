public class Location {
    final static int MAX_X = Game.GAME_WIDTH-1;
    final static int MAX_Y = Game.GAME_HEIGHT-1;
    int x,y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void change(Direction d){
        if((d==Direction.N||d==Direction.NE||d==Direction.NW)&&y<MAX_Y)y++;
        if((d==Direction.SE||d==Direction.S||d==Direction.SW)&&y>0)y--;
        if((d==Direction.NE||d==Direction.E||d==Direction.SE)&&x<MAX_X)x++;
        if((d==Direction.SW||d==Direction.W||d==Direction.NW)&&x>0)x--;
    }
    public Location copy(){
        return new Location(x, y);
    }
}
