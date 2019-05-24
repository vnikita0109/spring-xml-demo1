package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    private String message;
    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println(" After  Properties set call");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println(" Destroy call");

    }

    public void customInit(){
        System.out.println("Customised initialization of bean");
    }
    public void customDestroy(){
        System.out.println("Customised destruction of bean");
    }
}
