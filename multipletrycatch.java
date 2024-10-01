package pushpak43ExceptionHandling;

public class multipletrycatch {
    public static void main(String[] args) {
        try{
            int a =12;int b =0;int c;
            c =a/b;
            System.out.println(c);

        }catch (ArithmeticException a){

            System.out.println(a);

        }
        try {
            int a[] ={23,4,43,4,23};
            System.out.println(a[7]);

        }catch (ArrayIndexOutOfBoundsException b){
            System.out.println(b);

        }
    }
}
