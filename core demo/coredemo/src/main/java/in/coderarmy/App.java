package in.coderarmy;
import in.coderarmy.notification.sms;
import in.coderarmy.notification.notificationService;
public class App 
{
    public static void main( String[] args )
    {
        notificationService obj=new sms();
        // orderservice notify=new orderservice(obj);
        orderservice notify=new orderservice();
        notify.setnotificationService(obj);
        notify.placeorder();
    }
}
