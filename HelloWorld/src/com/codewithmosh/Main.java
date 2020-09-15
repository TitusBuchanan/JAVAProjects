package com.codewithmosh;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] numbers = new int[5][5];
        numbers[0][0] = 1;
        numbers[4][2] = 2;
        numbers[3][1] = 3;
        numbers[0][3] = 4;
        System.out.println(Arrays.deepToString(numbers));

    }
}


