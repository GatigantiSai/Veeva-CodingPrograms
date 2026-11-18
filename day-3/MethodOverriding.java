
import java.util.Scanner;

class Notification {
    void send(String recipient) {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification {
    void send(String recipient) {
        System.out.println("Email sent to " + recipient);
    }
}

class SMSNotification extends Notification {
    void send(String recipient) {
        System.out.println("SMS sent to " + recipient);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        String recipient = sc.next();

        Notification n;

        if (type.equals("E")) {
            n = new EmailNotification();
        } else {
            n = new SMSNotification();
        }

        n.send(recipient);

        sc.close();
    }
}
