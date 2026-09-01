package in.coderarmy.notification;

public class sms implements notificationService {
    @Override
    public void sendNotification() {
        System.out.println("SMS Notification sent");
    }
}
