package pushpak43ExceptionHandling;

public class Handaling {
    public static void main(String[] args) {
        try {
            System.out.println("pushpak");

            int a = 20;
            int b = 0;
            int c;

            c = a / b;
            System.out.println("Result of division: " + c);
            System.out.println("End of try block");

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("This will always be executed (finally block)");
        }
    }
}
