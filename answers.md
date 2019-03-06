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