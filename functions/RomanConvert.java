package functions;

import extensions.Romx;

public class RomanConvert {

    public static String decimal(Integer i) {
        Romx r = Romx
                .start(i)
                .pipe("IIIII", "V")
                .pipe("VV", "X")
                .pipe("XXXXX", "L")
                .pipe("LL", "C")
                .pipe("VIIII", "IX")
                .pipe("IIII", "IV")
                .pipe("XXXX", "XL")
                .pipe("LXL", "XC")  // Handling 90 (XC) - Add this line
                .pipe("CCCC", "CD")  // Handling 400 (CD)
                .pipe("CCCCC", "D")  // Handling 500 (D)
                .pipe("DD", "M");


        return r.getResult();
    }

}
