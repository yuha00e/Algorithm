class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n ; i++){
            answer[i] = (long)x * (i+1);
        }
        // x 만큼 커지는 수
        // 의 개수가 n개
        return answer;
    }
}