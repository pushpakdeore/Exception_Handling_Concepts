package pushpak43ExceptionHandling;

public class ThrowVsThrows {
   public static void div(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }else {
            int c =a/b;
            System.out.println(c);
        }

    }
    public static void main(String[] args) throws  ArithmeticException{
      div(3,0);



    }
}
