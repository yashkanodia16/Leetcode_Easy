// Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

// Example:

// Input: 38
// Output: 2 
// Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
//              Since 2 has only one digit, return it.


class Solution {
    public int addDigits(int num) {
        int n1,n2,n3 =0;
        if(num <= 9)
            return num;
        while(num > 9)
        {
        n1 = num/10;
        n2 = num%10;
        n3 = n1 + n2;
        num=n3;
        }
        return n3;
    }
}