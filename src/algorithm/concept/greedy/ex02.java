package algorithm.concept.greedy;

import java.util.Scanner;

/*
어떠한 수 N이 1일 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려고 합니다.
단, 두번째 연사은 N이 K로 나누어 떨어질 때만 선택할 수 있습니다.
    1. N에서 1을 뺍니다.
    2. N을 K로 나눕니다.
예를 들어 N이 17, K가 4라고 가정합시다. 이때 1번의 과정을 한 번 수행하면 N은 16이 됩니다.
이후에 2번의 과정을 두 번 수행하면 N은 1이 됩니다. 결과적으로 이 경우 전체 과정을 실행한 횟수는 3이 됩니다.
이는 N을 1로 만드는 최소 횟수입니다.
N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는 프로그램을 작성하세요.
 */
public class ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지 빼기
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // N이 K보다 작을 때 반복문 탈출
            if(n < k) break;
            // K로 나누기
            result += 1;
            n /= k;
        }
        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n - 1);
        System.out.println(result);
    }

}
