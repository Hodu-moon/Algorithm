package _0225;

import java.util.Arrays;
import java.util.Scanner;

public class NP {

    static int N;
    static int[] input;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        input = new int[N];

        for(int i = 0; i < N; i++){
            input[i] = sc.nextInt();
        }
        // 정렬된 상태에서 시작

        Arrays.sort(input);


        do{
            System.out.println(Arrays.toString(input));
        }while(nextPermutation());
    }

    static boolean nextPermutation(){
        // 1. 뒤쪽부터 탐색하며 교환위치 (i - 1) 찾기 (i : 꼭대기)
        int i = N - 1;
        // 1   4 3 2
        while( i > 0 && input[i - 1] >= input[i] )
            --i;

        // 4 3 2 1
        if( i == 0)
            return false;

        //2. 뒤쪽부터 탐색하며 교환위치(i - 1)와 교환할 큰 값 위치 j 찾기
        // step2 i-1 과 교환할 한단계 큰 수 찾기
        int j = N - 1;
        // 1 4 3 2
        while( input [i - 1] >= input[j])
            j--;
        //3. 뒤 위치 값 (i -1, j ) 교환
        swap(i-1, j);

        // 4. 꼭대기 위치(i) 부터 맨 뒤까지 오름차순 정렬
        int k = N - 1;
        while( i < k)
            swap(i++, k--);

        return true;
    }

    static void swap(int i , int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
