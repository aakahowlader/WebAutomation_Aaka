package exceptionhandling;

public class SalaryCalculator {

    public static void main(String[] args) {
        SalaryCalculator.doDivision(12,0);
    }

    public static int doDivision(int num1, int num2){
        // Exception Handling
        int result = 0;
        try {
            result= num1/num2;
            System.out.println("Division value is "+result);
        } catch (Exception exception){
            //exception.printStackTrace();
            //System.out.println("This is Arithmetic Exception");
            System.out.println("This is Arithmetic Exception. Value should be non Zero");
        }
        return result;
    }

//    public int doDivision1(int num1, int num2){
//
//
//    }















}
