package com.codewithme;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {3,4,5,6,7}
        };
        System.out.println(Arrays.toString(matrix));
        int max=matrix[0][0];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("max value is: "+max);
    }
}
