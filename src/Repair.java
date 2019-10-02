import becker.robots.*;

public class Repair {


    public static void main(String[] args) {

        City olney = new City();
        Robot karel = new Robot(olney, 7, 0, Direction.EAST, 300);
    /*
    Replace these lines below with the ones from the instruction sheet once you have your program working.
    Your code should work with the new lines without having to change anything.
     */
        new Wall(olney, 2, 0, Direction.SOUTH);
        new Wall(olney, 2, 0, Direction.EAST);
        new Wall(olney, 1, 1, Direction.SOUTH);
        new Wall(olney, 1, 1, Direction.EAST);
        new Wall(olney, 0, 2, Direction.SOUTH);

        new Wall(olney, 1, 2, Direction.EAST);
        new Wall(olney, 1, 3, Direction.SOUTH);
        new Wall(olney, 2, 3, Direction.EAST);
        new Wall(olney, 2, 4, Direction.SOUTH);

        new Wall(olney, 2, 4, Direction.EAST);
        new Wall(olney, 1, 5, Direction.SOUTH);
        new Wall(olney, 1, 5, Direction.EAST);
        new Wall(olney, 0, 6, Direction.SOUTH);

        new Wall(olney, 1, 6, Direction.EAST);
        new Wall(olney, 1, 7, Direction.SOUTH);
        new Wall(olney, 2, 7, Direction.EAST);
        new Wall(olney, 2, 8, Direction.SOUTH);

        new Wall(olney, 2, 8, Direction.EAST);
        new Wall(olney, 1, 9, Direction.SOUTH);
        new Wall(olney, 1, 9, Direction.EAST);
        new Wall(olney, 0, 10, Direction.SOUTH);

        new Wall(olney, 1, 10, Direction.EAST);
        new Wall(olney, 1, 11, Direction.SOUTH);
        new Wall(olney, 2, 11, Direction.EAST);
        new Wall(olney, 2, 12, Direction.SOUTH);

        new Wall(olney, 3, 12, Direction.EAST);
        new Wall(olney, 4, 12, Direction.EAST);
        new Wall(olney, 5, 12, Direction.EAST);
        new Wall(olney, 6, 12, Direction.EAST);
        new Wall(olney, 7, 12, Direction.EAST);

        new Wall(olney, 7, 0, Direction.SOUTH);
        new Wall(olney, 7, 1, Direction.SOUTH);
        new Wall(olney, 7, 2, Direction.SOUTH);
        new Wall(olney, 7, 3, Direction.SOUTH);
        new Wall(olney, 7, 4, Direction.SOUTH);
        new Wall(olney, 7, 5, Direction.SOUTH);
        new Wall(olney, 7, 6, Direction.SOUTH);
        new Wall(olney, 7, 7, Direction.SOUTH);
        new Wall(olney, 7, 8, Direction.SOUTH);
        new Wall(olney, 7, 9, Direction.SOUTH);
        new Wall(olney, 7, 10, Direction.SOUTH);
        new Wall(olney, 7, 11, Direction.SOUTH);
        new Wall(olney, 7, 12, Direction.SOUTH);

        Thing thing1 = new Thing(olney, 3, 0);
        Thing thing2 = new Thing(olney, 4, 0);
        Thing thing3 = new Thing(olney, 4, 4);
        Thing thing4 = new Thing(olney, 7, 4);
        Thing thing5 = new Thing(olney, 6, 4);
        Thing thing6 = new Thing(olney, 3, 8);
        Thing thing7 = new Thing(olney, 5, 8);
        Thing thing8 = new Thing(olney, 3, 12);
        Thing thing9 = new Thing(olney, 5, 12);
        Thing thing10 = new Thing(olney, 7, 12);


        // Your code goes below.
        int counter = 0;
        boolean clear = false;
        karel.turnLeft();
        do {
            clear = false;
            if (karel.frontIsClear()){
                karel.putThing();
                karel.move();
                counter ++;
            }
            else {
                karel.putThing();
                karel.turnLeft();
                karel.turnLeft();
                while (counter != 0){
                    if (counter > 0){
                        karel.move();
                        counter--;
                    }
                    if (counter == 0){
                        karel.turnLeft();
                        karel.move();
                        karel.move();
                        karel.move();
                        karel.move();
                        karel.turnLeft();
                        if (karel.frontIsClear()){
                            clear = true;
                        }
                    }

                }
            }
        }while (clear = true);


    }
}
