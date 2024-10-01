package pushpak43ExceptionHandling;

public class NestedCatchblock {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }catch(Exception e){

            try {
                String a =null;
                System.out.println(a.toUpperCase());
            }catch (NullPointerException t){
                System.out.println("Null pointer exception");
            }
        }
        System.out.println("main method end");
    }
}
