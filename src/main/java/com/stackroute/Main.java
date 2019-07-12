
package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SuppressWarnings("ALL")
public class Main  {
    public static void main(String[] args) {
        //use Application Context to retrieve the actor details
        AbstractApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
       context.registerShutdownHook();

    }
}
