package pushpak43ExceptionHandling;

public class Throws {
    public static void main(String[] args) throws InterruptedException {
        //with throw
        for(int i =1;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
        // we can do like this also
        for(int j =1; j<=10; j++){
            try {
                System.out.println(j);
                Thread.sleep(100);
            }catch (InterruptedException p){
                System.out.println(p);
            }
        }
    }
}
