package in.coderarmy.notification;

public class popup implements notificationService {
    @Override
    public void sendNotification() {
        System.out.println("popup notification sent");
    }
    
}
