
function minimumMoves(input: string): number {
    const NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE = 3;
    const TARGET_CHAR = 'O';
    const CHAR_TO_CONVERT_TO_TARGET = 'X';

    let minMovesToConvertAllChars = 0;

    for (let i = 0; i < input.length; ++i) {
        if (input.charAt(i) === CHAR_TO_CONVERT_TO_TARGET) {
            i += NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE - 1;
            ++minMovesToConvertAllChars;
        }
    }
    return minMovesToConvertAllChars;
};
