package pushpak43ExceptionHandling;


public class trycatchvsthrows {

    public static void customWait() {
        try {
            for(int i =1;i<=10;i++){
                System.out.println(i);
               Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }

    public static void main(String[] args) {
        customWait();
        System.out.println("Method executed successfully.");
    }
}
