
class Solution {

    private companion object {
        const val NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE = 3
        const val TARGET_CHAR = 'O'
        const val CHAR_TO_CONVERT_TO_TARGET = 'X'
    }

    fun minimumMoves(input: String): Int {
        var minMovesToConvertAllChars = 0
        var i = 0

        while (i < input.length) {
            if (input[i] == CHAR_TO_CONVERT_TO_TARGET) {
                i += NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE - 1
                ++minMovesToConvertAllChars
            }
            ++i
        }
        return minMovesToConvertAllChars
    }
}
