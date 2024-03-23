import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int x = commands[i][0];
            int y = commands[i][1];
            int z = commands[i][2];
            int[] arr = new int[y - x];
            int[] array1 = Arrays.copyOfRange(array, x - 1, y);
            Arrays.sort(array1);

            answer[i] = array1[z - 1];


        }
        return answer;
    }
}