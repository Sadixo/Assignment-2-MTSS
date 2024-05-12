package it.unipd.mtss;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IntegerToRomanTest {

  @ParameterizedTest
  @MethodSource("numberToRoman")
  void checkNumbers(int number, String romanNum) {
    assertEquals(romanNum, IntegerToRoman.convert(number));
  }

  private static Stream<Arguments> numberToRoman() {
    return Stream.of(
        arguments(1, "I"),
        arguments(2, "II"),
        arguments(3, "III"),
        arguments(4, "IV"),
        arguments(5, "V"),
        arguments(6, "VI"),
        arguments(7, "VII"),
        arguments(8, "VIII"),
        arguments(9, "IX"),
        arguments(10, "X")
        );
  } 
}
