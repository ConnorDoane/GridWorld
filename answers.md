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
