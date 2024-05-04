import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(123, 456);
        System.out.println("Wynik sumy dwóch liczb 123 i 456:  " + result);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Wynik dodania to: " + result);
    }
}
