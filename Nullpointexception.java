package pushpak43ExceptionHandling;

public class Nullpointexception {
    public static void main(String[] args) {
        String str ="knvj";
        try {
            System.out.println(str.toUpperCase());
        }catch (NullPointerException e){
            System.out.println("null can not be casted");
        }


        String str1 ="555h";
        try {
            int a =Integer.parseInt(str1);
            System.out.println(a);
        }catch (NumberFormatException n){
            System.out.println("String charecter are alphabert ");
        }
        System.out.println("main method end");
    }

}
