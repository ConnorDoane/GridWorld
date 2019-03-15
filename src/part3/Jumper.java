import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class Jumper extends Bug {

    public Jumper() {
        setColor(Color.RED);
    }
    public Jumper(Color color) {
        setColor(color);
    }

    public void turn() {
        setDirection(getDirection() + Location.RIGHT);
    }

    public void move() {
        Grid<Actor> gr = getGrid();
        if (gr == null) return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        if (gr.isValid(next)) {
            moveTo(next);
        } else {
            removeSelfFromGrid();
        }
        Flower flower = new Flower(getColor());
        flower.putSelfInGrid(gr, loc);
    }

    public boolean canMove() {
        Grid<Actor> gr = getGrid();
        if (gr == null) return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        if (!gr.isValid(next)) return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
    }

}