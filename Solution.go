
package main

import "fmt"

func minimumMoves(input string) int {
    const NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE = 3
    const TARGET_CHAR = 'O'
    const CHAR_TO_CONVERT_TO_TARGET = 'X'

    minMovesToConvertAllChars := 0

    for i := range input {
        if input[i] == CHAR_TO_CONVERT_TO_TARGET {
            i += NUMBER_OF_CONSECUTIVE_CHARS_TO_BE_REMOVED_AT_ONCE - 1
            minMovesToConvertAllChars++
        }
        i++
    }
    return minMovesToConvertAllChars
}
