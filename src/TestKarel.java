import becker.robots.*;

public class TestKarel {

    public static void main(String[] args)
        {
            City toronto = new City();
            Robot karel = new Robot(toronto, 3, 0, Direction.EAST, 0);
            new Thing(toronto, 3, 0);

            karel.pickThing();
            karel.move(); // start moving - woot!
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.move();
        }
}
