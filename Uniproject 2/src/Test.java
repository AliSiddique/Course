public class Test {
    public static void main(String[] args) {
        Student myself = new Student("Ali", 210052654);
        System.out.println(myself.isPassJava());
        //new Team
        Team others = new Team(myself, new Student("Jesse", 44444),
                new Student("Ali", 55555));

        System.out.println(onePass(others));
        System.out.println(Team.getNumberOfTeams());
    }
    //method to check passJava
    public static boolean onePass(Team te){
        return ((te.getMember1().isPassJava() || te.getMember2().isPassJava())
                || te.getMember3().isPassJava());
    }
}
