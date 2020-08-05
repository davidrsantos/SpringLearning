package com.santos.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnatationBeanScopeDemoApp {
  public static void main(String[] args) {
// load spring config file
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	  // retrieve bean from spring conteiner
	  Coach theCoach = context.getBean("tennisCoach", Coach.class);

	  Coach alphaCoach =  context.getBean("tennisCoach", Coach.class);
	  // check if they are the same

	  boolean result = (theCoach == alphaCoach);

    // print out the results

    System.out.println("\nPointing to the same object: " + result);

    System.out.println("\nMemory location for theCoach: " + theCoach+ "\nMemory location for alphaCoach: " + alphaCoach);

	  //close the context

	  context.close();

  }
}
