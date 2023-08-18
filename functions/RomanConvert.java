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
                .pipe("IIII", "IV")
                .pipe("VIIII", "IX")
                .pipe("XXXX", "XL")
                .pipeEnd("VIIII", "IX")
                .pipeEnd("IIII", "IV");

        return r.getResult();
    }

}
