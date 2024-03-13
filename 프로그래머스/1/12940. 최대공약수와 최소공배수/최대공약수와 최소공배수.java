class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        //최대 공약수 -> 유클리드 호제법
        int a = Math.max(n, m); //n,m 중 큰것
        int b = Math.min(n, m); //n,m 중 작은 것
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        answer[0] = a;
        //최소 공배수
        answer[1] = n * m / a;


        return answer;
    }
}