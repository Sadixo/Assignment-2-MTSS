package it.unipd.mtss;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RomanPrinterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
	System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
	System.setOut(originalOut);
    }

    @ParameterizedTest
    @MethodSource("stringToAsciiArt")
    void checkAsciiArt(int romanNum, String asciiNumber) {
	RomanPrinter.print(romanNum);
	assertEquals(asciiNumber, outContent.toString());
    }

    private static Stream<Arguments> stringToAsciiArt() {
	return Stream.of(
			 arguments(1," ___ \n"+
				   "|_ _|\n"+
				   " | | \n"+
				   " | | \n"+
				   "|___|\n"),
			 arguments(2," ___  ___ \n"+
				   "|_ _||_ _|\n"+
				   " | |  | | \n"+
				   " | |  | | \n"+
				   "|___||___|\n"),
			 arguments(3," ___  ___  ___ \n"+
				   "|_ _||_ _||_ _|\n"+
				   " | |  | |  | | \n"+
				   " | |  | |  | | \n"+
				   "|___||___||___|\n"),
			 arguments(4," ___ __     __\n"+
				   "|_ _|\\ \\   / /\n"+
				   " | |  \\ \\ / / \n"+
				   " | |   \\ V /  \n"+
				   "|___|   \\_/   \n"),
			 arguments(5,"__     __\n"+
				   "\\ \\   / /\n"+
				   " \\ \\ / / \n"+
				   "  \\ V /  \n"+
				   "   \\_/   \n"),
			 arguments(6,"__     __ ___ \n"+
				   "\\ \\   / /|_ _|\n"+
				   " \\ \\ / /  | | \n"+
				   "  \\ V /   | | \n"+
				   "   \\_/   |___|\n")
			 );
    } 
}
