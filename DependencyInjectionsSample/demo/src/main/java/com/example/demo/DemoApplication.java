package com.example.demo;
import com.example.demo.chapter03.used.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args).getBean(DemoApplication.class).excute();
	}


	@Qualifier("morningGreet") // 사용할 객체( 사용되는 객체 )의 이름으로 인스턴스를 생성할 객체를 매핑한다.
	@Autowired // 외부에서 인스턴스를 생성해 주입해주는 어노테이션이다.
	Greet greet; // 필드에 메소드 또는 변수를 지정한다.

	private void excute(){

		greet.greeting();

	}
}