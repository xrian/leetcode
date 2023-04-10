/**
 * https://leetcode.cn/problems/island-perimeter/
 */
package com.sukdao.leetcode;

import com.sukdao.leetcode.util.ArrayUtils;

public class Solution463 {

  /**
   * 判断 x,y 在 网格中是否是水
   *
   * @param grid
   * @param x
   * @param y
   * @return
   */
  private int check(int[][] grid, int x, int y) {
    if (x < 0 || y < 0 || x >= grid.length) {
      // 超出边界，判定为水
      return 1;
    }
    int[] row = grid[x];
    if (y >= row.length || row[y] == 0) {
      // 超出边界，或者值为0，判定为水
      return 1;
    }
    return 0;
  }

  public int islandPerimeter(int[][] grid) {

    int total = 0;
    for (int rowIndex = 0; rowIndex < grid.length; rowIndex++) {
      int[] columns = grid[rowIndex];
      for (int columnIndex = 0; columnIndex < columns.length; columnIndex++) {
        int column = columns[columnIndex];
        if (column == 1) {
          total += check(grid, rowIndex - 1, columnIndex);
          total += check(grid, rowIndex, columnIndex + 1);
          total += check(grid, rowIndex + 1, columnIndex);
          total += check(grid, rowIndex, columnIndex - 1);
        }
      }
    }

    return total;
  }

  public static void main(String[] args) {
    int[][] grid = ArrayUtils.parseArray("[[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]");
//    int[][] grid = ArrayUtils.parseArray("[[1,0]]");
    var main = new Solution463();
    int num = main.islandPerimeter(grid);
    System.out.println(num);

  }

}
