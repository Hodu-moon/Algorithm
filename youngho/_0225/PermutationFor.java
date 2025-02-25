package _0225;

public class PermutationFor {

    // {1, 2, 3} 을  3P3 을 반복문으로 짜보자
    public static void main(String[] args) {

        // 3P2
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(j == i)
                    continue;

                for(int k = 1; k <= 3; k++){
                    if(k == i  || k == j){
                        continue;
                    }

                    System.out.println(i + " " + j + " " + k);

                }

            }
        }


    }
}
