////////////////////////////////////////////////////////////////////
// [Giuseppe] [Tutino] [2075515]
// [Manuel] [Gusella] [2076430]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class RomanPrinter {

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){

        if(romanNumber.isEmpty()) {return null;}

        String[] splitted = romanNumber.split("");

        for (int i = 0; i<romanNumber.length(); i++) {
            switch(splitted[i]) {
            case "I":
                splitted[i] = " ___ \n|_ _|\n | | \n | | \n|___|\n";
                break;

            case "V":
                splitted[i] = "__     __\n\\ \\   / /\n"+
                    " \\ \\ / / \n  \\ V /  \n   \\_/   \n";
                break;

            case "X":
                splitted[i] = "__  __\n\\ \\/ /\n \\  / \n /  \\ \n/_/\\_\\\n";
                break;

            case "L":
                splitted[i] = " _     \n| |    \n| |    \n| |___ \n|_____|\n";
                break;

            case "C":
                splitted[i] = "  ____ \n / ___|\n| |    \n| |___ \n \\____|\n";
                break;

            case "D":
                splitted[i] = " ____  \n|  _ \\ \n| | | |\n| |_| |\n|____/ \n";
                break;

            case "M":
                splitted[i] =
                    " __  __ \n|  \\/  |\n| |\\/| |\n| |  | |\n|_|  |_|\n";
                break;
            }
        }

        for (int j=0; j<5; j++){
            for (int i = 0; i<romanNumber.length(); i++) {
                String temp = splitted[i].split("\n")[0];
                System.out.print(temp);

                splitted[i] = splitted[i].substring(temp.length()+1);
            }
            System.out.print("\n");
        }
        
        return null;
    }
}
