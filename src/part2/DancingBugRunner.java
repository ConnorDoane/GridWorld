import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner {
    public static void main(String[] args) {

        int[] aliceArray = {5,2,6,4,7,4,2,5,3};
        int[] bobArray = {5,4,6,8,4,2,3,5,3,5};

        ActorWorld world = new ActorWorld();
        DancingBug alice = new DancingBug(aliceArray);
        alice.setColor(Color.ORANGE);
        DancingBug bob = new DancingBug(bobArray);
        world.add(new Location(7,8), alice);
        world.add(new Location(5,5), bob);
        world.show();
    }
}