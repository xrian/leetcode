package com.sukdao.leetcode.util;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {

  public static int[][] covertList(List<List<Integer>> list) {
    int[][] arr = new int[list.size()][];
    for (int i = 0; i < list.size(); i++) {
      List<Integer> columns = list.get(i);
      int[] columnArr = new int[columns.size()];
      for (int y = 0; y < columns.size(); y++) {
        columnArr[y] = columns.get(y);
      }
      arr[i] = columnArr;
    }
    return arr;
  }

  public static int[][] parseArray(String str) {
    List<List<Integer>> root = null;
    List<Integer> sub = null;
    StringBuilder sb = new StringBuilder();
    for (String s : str.split("")) {
      if (" ".equals(s)) {
        continue;
      }else if ("[".equals(s)) {
        // 如果是左括号，创建数组
        if (root == null) {
          root = new ArrayList<>();
        } else {
          sub = new ArrayList<>();
        }
      } else if ("]".equals(s)) {
        if (sub != null) {
          sub.add(Integer.parseInt(sb.toString(), 10));
          sb.setLength(0);
          root.add(sub);
          sub = null;
        } else {
          break;
        }
      } else if (",".equals(s)) {
        if (sub != null) {
          // 子数组存在，将值转换成数字写入到数组中，并清空  stringbuilder
          sub.add(Integer.parseInt(sb.toString(), 10));
          sb.setLength(0);
        }
      }else {
        sb.append(s);
      }
    }
    return covertList(root);
  }
}
