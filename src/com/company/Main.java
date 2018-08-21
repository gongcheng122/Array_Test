package com.company;

//import sun.jvm.hotspot.utilities.IntArray;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array1[] = {0,1,2,3,4,5,6,7,8,9};//静态初始化数组

        //遍历一维数组方法一
        for(int x = 0; x<array1.length;x++){
            System.out.println("array1["+x+"] = "+array1[x]);
        }

        //遍历一维数组方法二
        int y = 0;
        int total = 0;
        do {
            total = total + array1[y];
            y++;
            System.out.println("y is "+y);
            System.out.println("total is "+total);
        }while(y != array1.length);
        System.out.println(array1.length);
  //      System.out.println(y);
//        System.out.println(total);

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


        //二维数组
        int intArray[][] = {{1,2},{2,3},{4,5}};//静态初始化
        /*
        int intArray[][] = new int[2][3];
        a[0][0] = 1;
        ...
         */

        // 第一个矩阵（动态初始化一个二维数组）
        int a[][] = new int[2][3];
// 第二个矩阵（静态初始化一个二维数组）
        int b[][] = { {1,5,2,8}, {5,9,10,-3}, {2,7,-5,-18} };
// 结果矩阵
        int c[][] = new int[2][4];
// 初始化第一个矩阵
        for(int i=0; i<2; i++)
            for(int j=0; j<3 ;j++)
                a[i][j] = (i+1) * (j+2);
// 计算矩阵乘积
        for (int i=0; i<2; i++){
            for (int j=0; j<4; j++){
                c[i][j]=0;
                for(int k=0; k<3; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }
// 输出结算结果
        for(int i=0; i<2; i++){
            for (int j=0; j<4; j++){
                System.out.printf("%-5d",c[i][j]);
            }
            System.out.print("\n");
        }


        System.out.print("array1 最大值 ： "+Array_MAX(array1)+"\n");
        System.out.print("array1 最大值 ： "+Array_MAX(new int[] {22,12,56,77,7,1,2,5,0,22})+"\n"); //匿名数组
    }

    public static int Array_MAX(int IntArrayMax[]){
        int IntArray[] = IntArrayMax;
        int y = IntArray.length; //y为数组大小


        int n = 0;  //用于遍历数组
        int m = 0;  //用于寄存数组中最大的值

        for(int i=0; i<y ; i++){
            if(m<IntArray[i]){
                m = IntArray[i];
            }
        }
        return m;
    }
}
