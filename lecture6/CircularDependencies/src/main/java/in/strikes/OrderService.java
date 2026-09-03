package in.strikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    PaymentService paymentService;
    // OrderService(PaymentService Paymentervice){
    //     this.paymentService=Paymentervice;
    // }
    void orderprint(){
        paymentService.payprint();
        getOrderDetails();
        System.out.println("Order placed");
    }
    void getOrderDetails(){
        System.out.println("OrderDetails");
    }
}
