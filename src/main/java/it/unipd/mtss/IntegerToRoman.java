////////////////////////////////////////////////////////////////////
// [Giuseppe] [Tutino] [2075515]
// [Manuel] [Gusella] [2076430]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.lang.StringBuilder;
import java.lang.String;

public class IntegerToRoman {

  public static String convert(int number){
    StringBuilder romanNumber = new StringBuilder();

    if (number > 0) {

      number = converter(number, 50, "L", romanNumber);
      number = converter(number, 40, "XL", romanNumber);
      number = converter(number, 10, "X", romanNumber);
      number = converter(number, 9, "IX", romanNumber);
      number = converter(number, 5, "V", romanNumber);
      number = converter(number, 4, "IV", romanNumber);
      number = converter(number, 1, "I", romanNumber);

      return romanNumber.toString();
    }

    return "";
  }

  private static int converter
    (int number, int top, String c, StringBuilder sb) {

    while(number/top >= 1) {
      sb.append(c);
      number -= top;
    }

    return number;
  }

}
