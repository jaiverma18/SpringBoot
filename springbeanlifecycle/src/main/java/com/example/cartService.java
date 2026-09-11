package com.example;

import java.util.Map;
import java.util.HashMap;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component 
public class cartService implements InitializingBean {
  Map<Integer,String> cartMap=new HashMap<>();
  
  void addToCart()
  {
    System.out.println("Item added to cart");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("afterPropertiesSet method called");
    cartMap.put(1,"Pranav");
    cartMap.put(2,"Jai");
    cartMap.put(3,"Yashi");
  }
  public String getCartMap(int key)
  {
    return cartMap.get(key);
  }
}
