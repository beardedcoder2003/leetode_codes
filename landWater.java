/*
you are given a program such that there is a matrix of land and water assigned as 'L' and 'W'. the user can give any index where a bomb
is dropped. if the bomb lands in water, then the Water 'W' changes to 'x' but if the bomb lands on Land 'L' then, each peice of land on
the matrix connected to it gets destroyed and is marked 'x'
 */

package com.shubh;
import java.util.*;
public class landWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int rows = sc.nextInt();
        System.out.println("enter the no. of columns");
        int cols = sc.nextInt();

        char[][] matrix = new char[rows][cols];  //matrix to have the elements
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.next().charAt(0);   //enter the values of the matrix
            }
        }
        int[] pos=new int[2];
        System.out.println("Enter the position where the bomb lands");
        System.out.println("enter the 'i' value: ");
        pos[0]=sc.nextInt();
        System.out.println("enter the 'j' value: ");
        pos[1]=sc.nextInt();

        if ((matrix[pos[0]][pos[1]]) == 'W')
            waterBomb(matrix, pos);

        if ((matrix[pos[0]][pos[1]]) == 'L')
            landBomb(matrix, pos, rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void landBomb(char[][] matrix, int[] pos, int rows, int cols){  //METHOD FOR BOMB ON LAND
        int i=0, j=0;
        int cond=0;
        matrix[pos[0]][pos[1]]='x';
        while(cond<8){
            if(matrix[i][j]=='x') {

                if(i-1>-1) {
                    if (matrix[i - 1][j] == 'L' || matrix[i - 1][j] == 'x') { //above element
                        matrix[i - 1][j] = 'x';
                    }
                }
                if(i+1<rows) {
                    if (matrix[i + 1][j] == 'L' || matrix[i + 1][j] == 'x') { //lower element
                        matrix[i + 1][j] = 'x';
                    }
                }
                if(j+1<cols) {
                    if (matrix[i][j + 1] == 'L' || matrix[i][j + 1] == 'x') { //right element
                        matrix[i][j + 1] = 'x';
                    }
                }
                if(j-1>-1) {
                    if (matrix[i][j - 1] == 'L' || matrix[i][j - 1] == 'x') { //left element
                        matrix[i][j - 1] = 'x';
                    }
                }
                if(i-1>-1 && j-1>-1) {
                    if (matrix[i - 1][j - 1] == 'L' || matrix[i - 1][j - 1] == 'x') { //upper-left element
                        matrix[i - 1][j - 1] = 'x';
                    }
                }
                if(i-1>-1 && j+1<cols) {
                    if (matrix[i - 1][j + 1] == 'L' || matrix[i - 1][j + 1] == 'x') { //upper-right element
                        matrix[i - 1][j + 1] = 'x';
                    }
                }
                if(i+1<rows && j-1>-1) {
                    if (matrix[i + 1][j - 1] == 'L' || matrix[i + 1][j - 1] == 'x') { //lower-left element
                        matrix[i + 1][j - 1] = 'x';
                    }
                }
                if(i+1<rows && j+1<cols) {
                    if (matrix[i + 1][j + 1] == 'L' || matrix[i + 1][j + 1] == 'x') { //lower-right element
                        matrix[i + 1][j + 1] = 'x';
                    }
                }

                }



            //checking if the loop reached the end of the matrix
            if(i==rows-1 && j==cols-1){
                i=0; j=0;
                cond++;
            }

            if(j==cols-1) {
                i++;
                j=0;
            }
            else{
            j++;
            }



        }

    }

    public static void waterBomb(char[][] matrix, int[] pos){    //METHOD FOR BOMB LANDING IN WATER
        matrix[pos[0]][pos[1]]='x';

    }
}
