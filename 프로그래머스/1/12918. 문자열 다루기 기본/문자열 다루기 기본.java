class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        //char[] arr = s.toCharArray();


        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                char a = s.charAt(i);
                if (a < '0' || a > '9') {
                    return false;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }
}