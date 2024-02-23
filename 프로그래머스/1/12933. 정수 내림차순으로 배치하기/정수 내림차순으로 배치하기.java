import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] digits = String.valueOf(n).split("");
        Arrays.sort(digits);

        StringBuilder num = new StringBuilder();
        for (String digit : digits) {
            num.append(digit);
        }

        long reversedNum = Long.parseLong(num.reverse().toString());
        System.out.println(reversedNum);
        return reversedNum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(128372);
    }
}

