import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try{

            int a=generateRandomNumber();
            int b=generateRandomNumber();
            System.out.println("the division of "+a+" by "+b+" is "+divide(a,b));

            int n = generateRandomNumber();
            long factorial =factorial(n);
            System.out.println(n+" factorial is "+factorial);

        }catch (ArithmeticException | IllegalArgumentException | CustomException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * calculate the division of a by b
     * if b is equal to 0 it throw a arithmetic exception
     * return a double
     * */
    public static double divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Can't divide by zero");
        }
        return (1.0*a)/b;
    }

    /**
     * calculate the factorial of n
     * throw a IllegalArgumentException if the number is negative
     * throw  a custom exception with the message "The number is too large"
     * if the number exceed 30
     * return a long
     * */
    public static long factorial(int n) throws IllegalArgumentException, CustomException {
        if (n<0){
            throw new IllegalArgumentException("The number must be positive");
        }
        if(n>25){
            throw new CustomException("The number is too large");
        }
        long result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }

        return result;



    }

    /**
     * Generate a int number between min=-50 and max=150
     * */
    public static int generateRandomNumber(){
        Random rd = new Random();
        int min =-50;
        int max =50;

        return rd.nextInt(max-min+1)+min;

    }
}