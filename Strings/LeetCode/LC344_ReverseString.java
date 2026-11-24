/*
 * LeetCode: 344 - Reverse String
 * Pattern: Two Pointers
 * Approach: Swap characters from both ends.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class LC344_ReverseString {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}