class Solution {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j) && answer[i] == 0) {
                    answer[i] = i - j;

                }
            }
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
