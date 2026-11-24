/*
 * LeetCode: 709 - To Lower Case
 * Pattern: String Traversal
 * Approach: Character conversion + String concatenation
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
public class LC709_ToLowerCase {
public String toLowerCase(String s) {

        String result = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            result = result + ch;
        }

        return result;
    }
}