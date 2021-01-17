package operators;

public class LearnUnaryOperator {

    // Increment operator: ++ always add 1 for future
    // PreIncrement: ++number
    // PostIncrement: number++

    // Decrement Operator: -- Decrease -1 for future
    // PreDecrement : --number
    // PostDecrement : number--

    static int num1 =44;
    public static void main(String[] args) {
        int number =30;
        ++number; // 1+30
        number++; // 31+   1 for Future
        number++; // 32+    1
        ++number; // 1+1+32
        --number; // 33
        --number; // 32
        number++; // 32+   1
        number--; // 1+32    -1 for future
        number--; // 32    -1
        number--;// 31   -1
        number--;// 30   -1
        --number; // -1-1+30
        ++number; //1+28
        ++number;// 1+29
        number++; //30+    1
        number--; // 1+30    -1
        --number; // -1-1+31
        System.out.println(number); // 29,30,28,31,27



    }




}
