package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("destroy method called");

    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Init called");

    }
    public void customInit()
    {
        System.out.println("My custom init is called");
    }


    public void customDestroy()
    {
        System.out.println("My custom Destroy is called");
    }

}
