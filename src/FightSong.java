public class FightSong {
    private static void first_verse(){
        System.out.println("Go, team, go! \nYou can do it.\n");
    }

    private static void second_verse(){
        System.out.println("Go, team, go! \nYou can do it.");
        System.out.println("You're the best, \nIn the West.");
        System.out.println("Go, team, go! \nYou can do it.\n");
    }

    public static void main(String [] args){
        first_verse();
        second_verse();
        second_verse();
        first_verse();
    }
}
