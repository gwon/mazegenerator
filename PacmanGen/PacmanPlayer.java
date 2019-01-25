import processing.core.PVector;
public class PacmanPlayer {
    //PVector.x, PVector.y 
    //public PVector position;
    public PVector position;
    public int facing;
    public PacmanPlayer(Tile[][] tileMap, float tileLength){
        facing = 0;
        position = new PVector(0, 0); 
    }

    public void update(){

    }

}
