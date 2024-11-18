public class Main {
    public static void main(String[] args) {
        int[][] grid = {{12,3,4,13,5},
        {11,21,2,14,16},
        {7,8,9,15,0},
        {10,17,20,19,1},
        {10,22,30,25,6}};
        GridPath g = new GridPath(grid);
        System.out.println(g.getNextLoc(0, 0));
        System.out.println(g.getNextLoc(1, 3));
        System.out.println(g.getNextLoc(2, 4));
        System.out.println(g.getNextLoc(4, 3));
        System.out.println(g.sumPath(1, 1));
    }
}