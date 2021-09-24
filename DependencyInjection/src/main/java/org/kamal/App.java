package org.kamal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

//        Book b1 = (Book)ctx.getBean("book1");
        Order o1 = (Order)ctx.getBean("order");
        System.out.println(o1);
    }
}
