public class Main {
    public static void main(String[] args) {
        GridPath g = new GridPath();
        System.out.println(g.getNextLoc(0, 0));
        System.out.println(g.getNextLoc(1, 3));
        System.out.println(g.getNextLoc(2, 4));
        System.out.println(g.getNextLoc(4, 3));
        System.out.println(g.sumPath(1, 1));
    }
}