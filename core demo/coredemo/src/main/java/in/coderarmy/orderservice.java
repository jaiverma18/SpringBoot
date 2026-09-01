package in.coderarmy;
import in.coderarmy.notification.notificationService;
public class orderservice {
    // notificationService obj=new emailservice();
    // notificationService obj1=new sms();
    // notificationService obj2=new popup();
    //pehle hme hr baar respective class ka object bnana pdta tha but ab hmne interface ka object bnaya hai jisse hme hr baar alag alag class ka object bnane ki jarurat nhi pd rhi hai.
    //but still hme alag alag class ka object bnana pd rha h
    //ab hmne kya kiya ki class ka constructor bnaya jisme interface ka already bna hua object pass kiya aur use hmare code ne use krliya
    //mainly hmara aim h ki ek class ek hi kaam kregi
    notificationService obj;
    public orderservice(notificationService Obj)
    {
        this.obj=Obj;
    }
    public orderservice()
    {
       
    }
    public void setnotificationService(notificationService obj)
    {
        this.obj=obj;
    }
    public void placeorder(){
        System.out.println("Order placed");
        obj.sendNotification();
    }

}
