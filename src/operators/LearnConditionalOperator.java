package operators;

public class LearnConditionalOperator {

    // && Conditional AND: All condition must have to be true then it will execute block of code
    // || Conditional OR: If one condition is true then block of code will execute

    // Pipe ||

    public static void main(String[] args) {
        int num1 = 50;
        int num2 =60;
        if (num1 == num2){
            // if condition is false then it will not execute if block of code
            System.out.println("Number1 is smaller than number2");
        }

        if (num1 == 50 && num2 == 60){
            System.out.println("we are comparing two numbers");
        }
        if (num1 == 55 || num2 == 60){
            System.out.println("we are comparing two numbers using OR Operator");
        }

    }



}
