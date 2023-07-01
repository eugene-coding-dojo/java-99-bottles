package ru.nergal.bottles;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bottles {
    public String verse(int verseNumber) {
        return switch (verseNumber) {
            case 2 -> """
                    2 bottles of beer on the wall, 2 bottles of beer.
                    Take one down and pass it around, 1 bottle of beer on the wall.
                    """;
            case 1 -> """
                    1 bottle of beer on the wall, 1 bottle of beer.
                    Take one down and pass it around, no more bottles of beer on the wall.
                    """;
            case 0 -> """
                    No more bottles of beer on the wall, no more bottles of beer.
                    Go to the store and buy some more, 99 bottles of beer on the wall.
                    """;
            default -> """
                    %1$s bottles of beer on the wall, %1$s bottles of beer.
                    Take one down and pass it around, %2$s bottles of beer on the wall.
                    """.formatted(verseNumber, verseNumber - 1);
        };
    }

    public String verses(int verseBegin, int verseEnd) {
        return IntStream
                .rangeClosed(100 - verseBegin, 100 - verseEnd)
                .mapToObj(verseNum -> this.verse(100 - verseNum))
                .collect(Collectors.joining("\n"));
    }

    public String song() {
        return this.verses(99, 0);
    }
}
