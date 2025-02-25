package _0225;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationRec {

    // 재귀로 {1, 2, 3} 을 출력해보자

    // n 개 중 r 개 뽑기

    static int N, R;
    static int[] nums;
    static boolean[] isSelected;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        R = sc.nextInt();

        nums = new int[N  ];
        isSelected = new boolean[N+ 1];

        permutation(0);
    }

    static void permutation(int cnt){

        if(cnt == R){
            System.out.println(Arrays.toString(nums));
        }

        for(int i = 1; i <= 3; i++){
            if(isSelected[i])
                continue;

            isSelected[i] = true;
            nums[cnt] = i;
            permutation(cnt + 1);
            isSelected[i] = false;
        }
    }


}
