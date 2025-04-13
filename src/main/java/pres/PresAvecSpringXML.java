package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //IMetier metier =(IMetier) context.getBean("metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Res"+metier.calcul());
    }
}