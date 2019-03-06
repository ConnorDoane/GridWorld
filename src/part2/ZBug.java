import info.gridworld.actor.Bug;

public class ZBug extends Bug {
    private int sideLength;
    private int sideCount;

    public ZBug(int length) {
        sideLength = length;
        sideCount = 0;
    }

    public void act() {
        if (sideCount == 0) {
            turn();
            turn();
            for(int i = 0; i < sideLength; i++) {
                move();
            }
            sideCount++;
        } else if (sideCount == 1) {
            turn();
            turn();
            turn();
            for(int i = 0; i < sideLength; i++) {
                move();
            }
            sideCount++;
        } else if (sideCount == 2) {
            turn();
            turn();
            turn();
            turn();
            turn();
            for(int i = 0; i < sideLength; i++) {
                move();
            }
            sideCount++;
        }
    }
}