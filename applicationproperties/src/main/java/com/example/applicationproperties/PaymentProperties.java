package com.example.applicationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component 
@ConfigurationProperties("payment-property") 
public class PaymentProperties {
    private String type;
    private int retrycount;
    private Boolean enabled;
      private int timeOut;
    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getRetryCount() {
        return retrycount;
    }
    public void setRetryCount(int retryCount) {
        this.retrycount = retryCount;
    }
  
    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }
    public int getTimeOut() {
        return timeOut;
    }


}
