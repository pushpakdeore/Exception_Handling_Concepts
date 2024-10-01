package pushpak43ExceptionHandling;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }

}
public class userdefineExcepation  {
    public static void vote(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("not eligibal to vote");
        }else {
            System.out.println("Eligibal to vote");
        }
    }
    public static void main(String[] args) {
        int age =8;
        try {
            vote(age);
        }catch (InvalidAgeException e){
            System.out.println(e);
        }

    }

}
