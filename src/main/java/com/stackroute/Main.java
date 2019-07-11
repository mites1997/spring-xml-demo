
package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("ALL")
public class Main  {
    public static void main(String[] args) {
        //use Application Context to retrieve the actor details
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       Movie movie= context.getBean("spiderman", Movie.class);
       movie.act();
        //XmlBeanFactory
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie2=factory.getBean("spiderman",Movie.class);
        movie2.act();

        //BeanDefinitionRegistry
        @Deprecated
        BeanDefinitionRegistry registry = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(registry);
       
        Movie mv1 =((XmlBeanFactory)factory).getBean("spiderman",Movie.class);
        mv1.act();

    }
}
