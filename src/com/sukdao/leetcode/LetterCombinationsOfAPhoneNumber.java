/**
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 * 17. 电话号码的字母组合
 * 可以通过不断循环暴力解决,有没有更简单的方式?
 * 考核关键是考核回溯
 *
 * @author iocntop@gmail.com
 */
package com.sukdao.leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    // 题解1       1 ms	37.8 MB

//    String[][] strArr = {
//            // 2
//            {"a", "b", "c"},
//            // 3
//            {"d", "e", "f"},
//            // 4
//            {"g", "h", "i"},
//            // 5
//            {"j", "k", "l"},
//            // 6
//            {"m", "n", "o"},
//            // 7
//            {"p", "q", "r", "s"},
//            // 8
//            {"t", "u", "v"},
//            // 9
//            {"w", "x", "y", "z"},
//    };
//
//    public List<String> letterCombinations(String digits) {
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < digits.length(); i++) {
//            // 48-57 表示 ASCII 码 0-9, 所以 num-50 等于数组下标
//            int num = digits.codePointAt(i) - 50;
//
//            List<String> strings = new ArrayList<>();
//            for (String s : list) {
//                for (String c : strArr[num]) {
//                    strings.add(s + c);
//                }
//            }
//            list = strings;
//
//            if (list.size() == 0) {
//                for (String c : strArr[num]) {
//                    list.add(c);
//                }
//            }
//        }
//
//        return list;
//    }


    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    public void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                combination.append(letters.charAt(i));
                backtrack(combinations, phoneMap, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }
    }


    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber l = new LetterCombinationsOfAPhoneNumber();
        List<String> list = l.letterCombinations("23");
        System.out.println(list.toString());
    }

}
