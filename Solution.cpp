
#include <string>
using namespace std;

class Solution {

    static const int NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE = 3;
    static const char TARGET_CHAR = 'O';
    static const char CHAR_TO_CONVERT_TO_TARGET = 'X';

public:
    int minimumMoves(const string& input) const {
        int minMovesToConvertAllChars = 0;

        for (size_t i = 0; i < input.length(); ++i) {
            if (input[i] == CHAR_TO_CONVERT_TO_TARGET) {
                i += NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE - 1;
                ++minMovesToConvertAllChars;
            }
        }
        return minMovesToConvertAllChars;
    }
};
