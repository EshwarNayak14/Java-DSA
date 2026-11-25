
/*
 * LeetCode 771 - Jewels and Stones
 *
 * Pattern: Brute Force (Nested Loop)
 * Method Used: Character-by-character comparison
 *
 * TC: O(J * S) = O(n²) when J ≈ S
 * SC: O(1)
 */

public class LC771_JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        int result = 0;

        for (int i = 0; i < jewels.length(); i++) {

            for (int j = 0; j < stones.length(); j++) {

                char jewel = jewels.charAt(i);
                char stone = stones.charAt(j);

                if (jewel == stone) {
                    result++;
                }
            }
        }

        return result;
    }
}
