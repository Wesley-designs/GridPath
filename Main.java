public class Main {
    public static void main(String[] args) {
        Location test = new Location(1, 1);

        System.out.println(test);

        GridPath g = new GridPath();
        System.out.println(g.getNextLoc(0, 0));
    }
}