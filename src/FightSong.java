public class FightSong {
    private static void blank_space(){
        System.out.println();
    }

    private static void first_verse(){
        System.out.println("Go, team, go! \nYou can do it.");
    }

    private static void second_verse(){
        first_verse();
        System.out.println("You're the best, \nIn the West.");
        first_verse();
        blank_space();
    }

    public static void main(String [] args){
        first_verse();
        blank_space();
        second_verse();
        second_verse();
        first_verse();
    }
}
