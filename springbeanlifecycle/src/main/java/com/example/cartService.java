package com.example;
import java.util.Map;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import org.springframework.beans.factory.DisposableBean;
// import org.springframework.stereotype.Component;

// @Component 
public class cartService implements /*BeanNameAware,ApplicationContextAware,*/DisposableBean {
  Map<Integer,String> cartMap=new HashMap<>();
  
  void addToCart()
  {
    System.out.println("Item added to cart");
  }
  // public void setBeanName(String name) {
  //   System.out.println("Bean name is: "+name);
  // }
  // public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
  //   System.out.println("Application context is: "+applicationContext);
  // }

  // @Override
  // public void /*afterPropertiesSet() throws Exception*/ {
  //   System.out.println("afterPropertiesSet method called");
  //   cartMap.put(1,"Pranav");
  //   cartMap.put(2,"Jai");
  //   cartMap.put(3,"Yashi");
  // }
  // void initImplementation()
  // {
  //   System.out.println("Bean created");
  //   cartMap.put(1,"Pranav");
  //   cartMap.put(2,"Jai");
  //   cartMap.put(3,"Yashi");
  // }
  @PostConstruct 
  void start()
  {
    System.out.println("Bean created");
    cartMap.put(1,"Pranav");
    cartMap.put(2,"Jai");
    cartMap.put(3,"Yashi"); 
  }
  @Override 
  public void destroy()throws Exception
  {
    cartMap.clear();
    System.out.println("Bean destroyed");
  }
  public String getCartMap(int key)
  {
    return cartMap.get(key);
  }
}
