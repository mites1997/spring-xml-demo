package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
   private Actor actor;

    public Movie() {
        this.actor = null;
    }

    public Movie(Actor actor)
    {
        this.actor=actor;

    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationcontext\n"+applicationContext);

    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory\n"+beanFactory);

    }

    public void setBeanName(String s) {
        System.out.println("setbeanname\n"+s);

    }
}
