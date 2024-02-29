import java.util.*;

class Solution {
    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] tmp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        int min = arr[0];

        List<Integer> list = new ArrayList<>();
        for (int i : tmp) {
            if (i != min) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
    }
}

