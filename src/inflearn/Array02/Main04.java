package inflearn.Array02;

import java.util.Arrays;
import java.util.Scanner;

public class Main04 {
    public int [] solution(int n){

       int [] arr = new int[n];
       arr[0] = 1;
       arr[1] = 1;
       for (int i=2; i<n; i++){
           arr[i] = arr[i-2] + arr[i-1];
       }
       return arr;
    }
    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x : T.solution(n)) System.out.print(x + " ");
    }
}
