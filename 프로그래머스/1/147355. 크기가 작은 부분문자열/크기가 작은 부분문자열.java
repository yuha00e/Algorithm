class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pLong = Long.parseLong(p); // long 타입 변환

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String c = t.substring(i, p.length() + i);
            long tLong = Long.parseLong(c);
            if (pLong >= tLong) {
                answer++;
            }
        }
        return answer;
    }
}