import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray(); // 문자열을 배열로 바꾸기
        Arrays.sort(chars); // 오름차순 정렬
        String arr = new String(chars); // 배열을 문자열로 바꾸기
        answer = new StringBuilder(arr).reverse().toString(); 
        // StringBulider 를 아용하여 문자열 뒤집기 / toString 으로 문자열로 반환
        return answer;
    }
}