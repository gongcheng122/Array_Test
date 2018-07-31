package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array1[] = {0,1,2,3,4,5,6,7,8,9};//静态初始化数组

        //遍历一维数组方法一
        for(int x = 0; x<array1.length;x++){
            System.out.println("array1["+x+"] = "+array1[x]);
        }

        int y = 0;
        int total = 0;
        do {
            total = total + array1[y];
            y++;
        }while(y == array1.length);
        System.out.println(array1.length);
        System.out.println(y);
        System.out.println(total);

        /*for(int x = 0; x<array1.length;x++){

            System.out.println("array1["+x+"] = "+array1[x]);
        }
*/
        //动态初始化数组
        char array2[] = new char[3];
        array2[0] = 'A';
        array2[1] = 'B';
        array2[2] = 'C';

        //



    }
}
