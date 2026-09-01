package in.coderarmy.notification;

public class emailservice implements notificationService {
    @Override
    public void sendNotification(){
        System.out.println("Notification sent");
    }
}
