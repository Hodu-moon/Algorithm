package _0225;


import java.util.Arrays;
import java.util.Scanner;

// N개중 R개를 순서를 고려하고 중복을 포함하지 않게 뽑아보자
public class PermutationBit {
    static int N, R;
    static int[] input, nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        R = sc.nextInt();
        input = new int[N];
        nums = new int[R];

        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }

        permutation(0, 0);
    }

    static void permutation(int cnt, int flag){
        if(cnt == R){
            System.out.println(Arrays.toString(nums));
            return;
        }

        for(int i = 0; i < N;i++){
            if((flag & 1 << i) != 0)
                continue;

            nums[cnt] = input[i];
            permutation(cnt + 1, flag | 1 << i);
        }

    }
}
