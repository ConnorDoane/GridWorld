import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
    private int[] array;
    private int currentEntry;

    public DancingBug(int[] array) {
        this.array = array;
        this.currentEntry = 0;
    }

    public void act() {
        for (int i = 0; i < this.array[currentEntry]; i++) {
            turn();
        }
        if(canMove()) {
            move();
        }

        this.currentEntry++;
        if (this.currentEntry >= this.array.length) {
            this.currentEntry = 0;
        }
    }
}