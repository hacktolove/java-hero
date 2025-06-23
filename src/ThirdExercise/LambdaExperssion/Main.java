package ThirdExercise.LambdaExperssion;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }

}

public class Main {

    public static void main(String[] args) {

        try{
            checkAge(12);
        }catch(InvalidAgeException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

        try{
            checkAge(18);
        }catch(InvalidAgeException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

    }

    public static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or older");
        }

        System.out.println("Access granted");
    }

}
