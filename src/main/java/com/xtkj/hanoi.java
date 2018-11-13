package com.xtkj;

public class hanoi {
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }

    /**
     * 无论有多少个盘子，都只认为有两个盘子，上面的和最下面的
     */
    public static void hanoi(int i, char left, char mid, char right) {
        if (i == 1) {
            System.out.println("将盘子1从" + left + "移动至" + right);
        } else {
            hanoi(i - 1, left, right, mid);
            System.out.println("将盘子" + i + "从" + left + "移动至" + right);
            hanoi(i - 1, mid, left, right);
        }
    }
}
