
using System;

public class Solution
{
    private static readonly int NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE = 3;
    private static readonly char TARGET_CHAR = 'O';
    private static readonly char CHAR_TO_CONVERT_TO_TARGET = 'X';
    public int MinimumMoves(string input)
    {
        int minMovesToConvertAllChars = 0;

        for (int i = 0; i < input.Length; ++i)
        {
            if (input[i] == CHAR_TO_CONVERT_TO_TARGET)
            {
                i += NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE - 1;
                ++minMovesToConvertAllChars;
            }
        }
        return minMovesToConvertAllChars;
    }
}
