public class GridPath
{
/** Initialized in the constructor with distinct values that never change */
private int[][] grid;
private int Col1;
private int Row1;

public GridPath(int[][] grid) {
    this.grid = grid;
    Col1 = (grid[0].length)-1;
    Row1 = (grid.length)-1;
}
/**
* Returns the Location representing a neighbor of the grid element at row and col,
* as described in part (a)
* Preconditions: row is a valid row index and col is a valid column index in grid.
* row and col do not specify the element in the last row and last column of grid.
*/
public Location getNextLoc(int row, int col)
{
    Location b = new Location(row, col);
    Location c = new Location(row, col);
    if (row == Row1 && col == Col1) {
        return b;
    }
    if (row < Row1) {
        b = new Location(row+1, col);
    } else {
        Location a = new Location(row, col+1);
        return a;
    }
    if (col < Col1) {
        c = new Location(row, col+1);
    } else {
        Location d = new Location(row+1, col);
        return d;
    }
    if (grid[b.getRow()][b.getCol()] < grid[c.getRow()][c.getCol()]) {
        return b;
    }
    return c;
}
/**
* Computes and returns the sum of all values on a path through grid, as described in
* part (b)
* Preconditions: row is a valid row index and col is a valid column index in grid.
* row and col do not specify the element in the last row and last column of grid.
*/
public int sumPath(int row, int col)
{
    int sum = 0;
    Location a = new Location(row, col);
    while (row<=Row1 && col<=Col1) {
        sum += grid[a.getRow()][a.getCol()];
        if (row == Row1 && col == Col1) {
            break;
        }
        a = getNextLoc(row, col);
        row = a.getRow();
        col = a.getCol();
    }
    return sum;
}
// There may be instance variables, constructors, and methods that are not shown.
}