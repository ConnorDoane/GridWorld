###PART ONE###

#QUESTIONS#

1. The bug only moves to a new location when it is facing an empty square
2. Always forward 1 square
3. It rotates 45 degrees to the right
4. Flowers that progressively get darker / degrade
5. if the bug is looking at the edge, it will rotate. If not, it will move like usual along the edge
6. it will rotate 45 degrees to the right until there is a blank space in front of it
7. no, it only decays
8. it decays over time after being placed behind the Bug
9. no, but it can be colored when constructed
10. no, the bug will avoid most actors and ignore flowers in front of them, replacing a new one behind it as it leaves

#EXERCISES#

1.  0   - North
    45  - NorthEast
    90  - East
    135 - SouthEast
    180 - South
    225 - SouthWest
    270 - West
    315 - NorthWest
    360 - North

2.  You can "move" anywhere because you're just setting the position. However, if you attempt to move beyond the confines of the grid, you'll get an error message.

3.  setColor() with a Color parameter.

4.  The bug is gone, the Rock overrid it, like the Bug does to flowers.


###PART TWO###

#QUESTIONS#

1.  sideLength is the length of the square the BoxBug will create
2.  steps counts the amounts of steps that have already been made by the bug, to keep a running total of the current length of the side it's making and to know when to turn to keep the box the size of sideLength
3. because the bug needs to rotate 90 degrees, a full right angle, to create a box.
4. BoxBug inherits the move method from Bug
5. yes, its sidelength is given when constructed, and doesn't change after that
6. It can if a rock is put in its path, or it reaches the edge of the grid
7. steps will be equal to zero when the bug is created and after the bug has turned but before it has made a step, this happens after it can't move forward, or has moved forward equal to sideLength

#EXERCISES#

1.  It creates an Octagon with the sideLength given, instead of a box.

5.  To add another BoxBug to the BoxBugRunner class, you'd first have to initialize it and give it a name, for example: 

BoxBug charlie = new BoxBug(6);

You can now, if you'd like, change its color so you can differentiate it from the other bugs

charlie.setColor(Color.BLUE);

Finally, you have to actually add the BoxBug to the grid

world.add(new Location(4,4), charlie);


###PART THREE###

#QUESTIONS#

1.  loc1.getRow();
2.  false
3.  (4, 4)
4.  135
5.  when calling it, you pass it the parameter of the direction, for example:

loc1.getAdjacentLocation(Location.SOUTH);

this will return the location adjacent to the SOUTH of the calling location

1.  use getOccupiedLocations() to get an arrayList of all current locations that are occupied. Using this, you can also get a count of empty locations, just find the total locations, and subtract the occupied locations
2.  isValid(new Location(10,10));
3.  The grid is an arrayList of Actors.
4.  I don't think it would be better to return an array, because that would take way more code. Arrays require a specific length, but you don't always know how many items you're going to get from one of these functions, so by making it an arrayList you don't have to worry about the potential length.

1. All actors have a direction, color and Location
2. When first constructed, an actor faces North and is Blue
3. So other objects can extend Actor and inherit its properties while changing what it needs
4. An actor can't put itself into the grid twice. It gives an error message when you try. An actor CAN take itself out of the grid and then put itself back later.
5. this.setDirection(this.getDirection() + 90);

1. if (!gr.isValid(next)) {return false}; tests if the next location is valid in the Grid
2. return (neighbor == null) || (neighbor instanceof Flower); checks if the next position does not exist or is an instance of a flower. Anything else (such as a rock) won't work
3. isValid and get, to ensure the next location is valid and doesn't already have an actor in it besides a Flower
4. getAdjacentLocation to find the next location the bug will potentially move to
5. getLocation getDirection and getGrid
6. it will remove itself from the grid
7. it's needed because it stores the bug's location before it moves so it can leave a flower in the Bug's old location once it has moved.
8. in the Move() method, when creating the Flower it calls getColor() which returns the Bug's color. This is so you can differentiate the flowers left from different Bugs from those left from other Bugs
9. calling removeSelfFromGrid on a bug does not cause it to leave a Flower behind. However, in the move() method, it does because it acts just as though the bug has moved in that case.
10. Flower flower = new Flower(getColor());
flower.putSelfInGrid(gr, loc);
11. 4 times

##GROUP ACTIVITY##

#SPECIFY#

a. turn
b. turn
c. turn
d. turn
e. if its one space in front of the jumper, it will jump over it. Otherwise it will turn
f. no

#DESIGN#

a. Bug
b. Bug, the Jumper is just a bug but it moves 2 spaces at a time, jumping over other Actors
c. Yes. No parameters are needed, but we can have a separate constructor that chooses the Color of the Jumper
d. move(), canMove(), turn()
e. none
f. Set up an "obstacle course" in the Grid with different potential cases for Jumpers, and see if they behave as intended