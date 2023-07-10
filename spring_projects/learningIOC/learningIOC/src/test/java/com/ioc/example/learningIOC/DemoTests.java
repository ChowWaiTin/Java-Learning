package com.ioc.example.learningIOC;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.ioc.example.learningIOC.data.Car;
import com.ioc.example.learningIOC.data.Person;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class DemoTests {

	@Autowired
    private ApplicationContext appContext;

    @Test
	void demoTests() {

		Person john = new Person();

        Car myCar = (Car) appContext.getBean("car");
        john.setCar(myCar);
		log.info("Tests >> " + john);

        for (String name: appContext.getBeanDefinitionNames()) {
            log.info("Bean Names >>" + name);
        }
	}

    

}
