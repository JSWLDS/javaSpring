package com.example.demo;

import com.example.demo.chapter03.used.EvenGreet;
import com.example.demo.chapter03.used.MorningGreet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args).getBean(DemoApplication.class).multiAutowired(new MorningGreet(), new EvenGreet());
	}

	@Autowired
	public void multiAutowired(MorningGreet morningGreat, EvenGreet evenGreat){
		morningGreat.greeting();
		evenGreat.greeting();

	}
//	private void execute(){
//		greet.greeting();
//	}

}
