package pushpak43ExceptionHandling;

public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            int a =19;int b= 8;int c;
            c =a/b;
            System.out.println(c);
            try{
                int v[] ={1,2,3};
                System.out.println(v[9]);

            }catch (ArrayIndexOutOfBoundsException r){
                System.out.println(r);
            }
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("end main method");
    }
}
