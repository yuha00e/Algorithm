class Solution {
    public int solution(int[] numbers) {
        // 배열 더하기
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // 결과 계산
        int answer = 45 - sum;

        System.out.println(answer);
        return answer;
    }
}

