package Section3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int []array = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Nhập phần tử thứ: "+ (i+1));
            array[i] = sc.nextInt();
        }
        System.out.println("Các phần tử của mảng: ");
        for (int a : array){
            System.out.print(a+" ");
        }
        int sum=0;
        int product=1;
        for(int a: array){
            sum+=a;
            product*=a;
        }
        System.out.println();
        System.out.println("Tổng các phần tử trong mảng là: " +sum);
        System.out.println("Tích các phần tử trong mảng là: " +product);
        int min= array[0];
        int max= array[0];
        for (int a : array){
            if (a<min){
                min = a;
            }
            if (a>max){
                max = a;
            }
        }
        System.out.println("Min = " +min);
        System.out.println("Max = " +max);
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp là: ");
        for (int a : array){
            System.out.print(a+" ");
        }

    }

}
