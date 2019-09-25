import becker.robots.*;


public class Hurdler {

    public static void main(String[] args) {
        City olney= new City();
        Robot karel = new Robot(olney, 6, 0, Direction.EAST, 0);
    /*
    Replace these lines below with the ones from the instruction sheet once you have your program working.
    Your code should work with the new lines without having to change anything.
     */
        new Wall(olney, 6, 2, Direction.WEST);
        new Wall(olney, 6, 4, Direction.WEST);
        new Wall(olney, 6, 5, Direction.WEST);
        new Wall(olney, 6, 7, Direction.WEST);
        new Wall(olney, 5, 2, Direction.WEST);
        new Wall(olney, 4, 2, Direction.WEST);
        new Wall(olney, 5, 5, Direction.WEST);
        new Wall(olney, 5, 7, Direction.WEST);
        new Wall(olney, 4, 7, Direction.WEST);
        new Wall(olney, 3, 7, Direction.WEST);



        // Leave these lines alone as they make up the ground and the end wall
        new Wall(olney, 6, 0, Direction.SOUTH);
        new	Wall(olney, 6, 1, Direction.SOUTH);
        new Wall(olney, 6, 2, Direction.SOUTH);
        new Wall(olney, 6, 3, Direction.SOUTH);
        new Wall(olney, 6, 4, Direction.SOUTH);
        new	Wall(olney, 6, 5, Direction.SOUTH);
        new Wall(olney, 6, 6, Direction.SOUTH);
        new Wall(olney, 6, 7, Direction.SOUTH);
        new Wall(olney, 6, 8, Direction.WEST);
        new Wall(olney, 5, 8, Direction.WEST);

        int counter = 0;


        do {
            if (karel.frontIsClear()) {
                karel.move();

            }
            else {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                counter += 1;
                    if (karel.frontIsClear()){
                        karel.move();
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.turnLeft();

                        do {
                            karel.move();
                            counter -= 1;
                            if (counter == 0){
                                karel.turnLeft();
                                break;
                            }
                        }while (true);
                    }
            }
            System.out.print(counter);
        }while (true);
    }
}
