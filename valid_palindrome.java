// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

// Note: For the purpose of this problem, we define empty string as valid palindrome.

// Example 1:

// Input: "A man, a plan, a canal: Panama"
// Output: true
// Example 2:

// Input: "race a car"
// Output: false
 

// Constraints:

// s consists only of printable ASCII characters.

class Solution {
    public boolean isPalindrome(String s) {
        String[] arr = s.toLowerCase().split(" |_|\\W+");
        String str = "";
        for(String i:arr)
            str = str +i;
        int i=0;
        int j=str.length()-1;
        for(int k=0;k<str.length()-1;k++)
        {
        while(i<j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
                
        }
        }
       return true;
    }
}