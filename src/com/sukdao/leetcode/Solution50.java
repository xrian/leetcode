package com.sukdao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution50 {

  private double anInt(double x, int n, int end, List<Double> list) {
    // 将底数乘2
    int k = n * 2;
    if (n == end) {
      return x;
    } else if (k < end) {
      // 继续往后分
      double now = x * x;
      list.add(x);
      return anInt(now, k, end, list);
    } else if (k == end) {
      // 恰好合适,直接返回
      return x * x;
    } else if (k > end) {
      double prev = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      if (end - n > 0) {
        return x * anInt(prev, n / 2, end - n, list);
      } else {
        return anInt(prev, n / 2, end, list);
      }
    }
    return 0;
  }

  public double myPow(double x, int n) {

    return 0;
  }

  private String toBinary(int n) {
    StringBuilder sb = new StringBuilder();
    int num1 = n;
    while (num1 > 0) {
      int remainder = num1 % 2;
      num1 = num1 / 2;
      sb.insert(0, remainder);
    }
    return sb.toString();
  }

  private String toBinary(double n) {
    StringBuilder sb = new StringBuilder();
    double num1 = n;
    for (int i = 0; i < 10; i++) {
      Double x = num1 * 2;
      int y = x.intValue();
      sb.append(y);
      num1 = x - y;
      System.out.println(y);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Solution50 solution50 = new Solution50();
//    double num = 0.68;
//    String x = Double.tos(num);
//    String y = solution50.toBinary(num);
//    System.out.println(x);
//    System.out.println(y);
//    System.out.println(x.equals(y));
    List<Double> d = new ArrayList<>();
    double a = solution50.anInt(2, 1, 20, d);
    System.out.println(a);

  }
}
