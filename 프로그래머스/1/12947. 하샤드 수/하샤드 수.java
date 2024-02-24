class Solution {
    public boolean solution(int x) {
        
        int a = x % 10;
        int b = (x / 10) % 10;
        int c = (x / 100) % 10;
        int d = (x / 1000) % 10;
        int e = x / 10000;

        
        int sumOfDigits = a + b + c + d + e;

       
        return x % sumOfDigits == 0;
    }
}

