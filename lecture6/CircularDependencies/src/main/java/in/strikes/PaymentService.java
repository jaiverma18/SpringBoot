package in.strikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class PaymentService{
    @Autowired
    OrderService orderService;
    // PaymentService(OrderService orderservice)
    // {
    //     this.orderService=orderservice;
    // }
    void payprint()
    {
     System.out.println("Payment done");
    //not its job
    //orderService.getOrderDetails();
    }
}
