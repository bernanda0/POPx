import extensions.Opx;
import extensions.Romx;
import functions.Operation;
import functions.RomanConvert;

public class driver {
    public static void main(String[] args) {
//        usual way
        int result = Operation.minus(Operation.increment(Operation.add(Operation.squared(2), 1)), 1240);
        System.out.println(result);

//        pipeline
        Opx<Integer> o = Opx
                .start(2)
                .pipe(Operation::squared)
                .pipe(Operation::add, 1)
                .pipe(Operation::increment)
                .pipe(Operation::minus, 1240);

        System.out.println(o.getResult());

        for(int i = 0; i < 50; i++) {

        }
        System.out.println(RomanConvert.decimal(39));

    }
}
