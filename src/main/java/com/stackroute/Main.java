package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main( String[] args )
    {

      /*  BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movie0=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie");
        System.out.println(movie0.getActor().getName()+ " acted in: " + movie0.getMovieName());
*/

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        System.out.println(movie.getMovieName()+" has actor "+movie.getActor().getName());

       /* Movie movie1=context.getBean("movie",Movie.class);
        Movie movie2=context.getBean("movie",Movie.class);
        System.out.println(movie1==movie2);
       Movie movie1=context.getBean("Doctor",Movie.class);
        Movie movie2=context.getBean("Highkick",Movie.class);
        System.out.println(movie1==movie2);*/
    }
}
