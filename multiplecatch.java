package pushpak43ExceptionHandling;

public class multiplecatch {
    public static void main(String[] args) {
        try{
            int a =10;int b=3;int c;
            c= a/b;
            System.out.println(c);

            int [] arr= {132,4,3,4,4,4};
            System.out.println(arr[1]);

            String s ="fmf";
            System.out.println(s.toUpperCase());

        }
        catch (ArithmeticException a){
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (NullPointerException n){
            System.out.println("NullPointerException");
        }catch (Exception f){
            System.out.println(f);
        }
    }

}
