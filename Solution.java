
public class Solution {

    private static final int NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE = 3;
    private static final char TARGET_CHAR = 'O';
    private static final char CHAR_TO_CONVERT_TO_TARGET = 'X';

    public int minimumMoves(String input) {
        int minMovesToConvertAllChars = 0;

        for (int i = 0; i < input.length(); ++i) {
            if (input.charAt(i) == CHAR_TO_CONVERT_TO_TARGET) {
                i += NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE - 1;
                ++minMovesToConvertAllChars;
            }
        }
        return minMovesToConvertAllChars;
    }
}
