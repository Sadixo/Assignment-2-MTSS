////////////////////////////////////////////////////////////////////
// [Giuseppe] [Tutino] [2075515]
// [Manuel] [Gusella] [2076430]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.lang.StringBuilder;

public class IntegerToRoman {
  public static String convert(int number){
    StringBuilder romanNumber = new StringBuilder();

    if (number > 0) {
      while(number > 0) {
        romanNumber.append("I");
        number--;
      }
      return romanNumber.toString();
    }

    return "";
  }
}
