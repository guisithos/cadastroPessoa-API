 package br.com.guithomas.springbootmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

 @SpringBootApplication(scanBasePackageClasses = "br.com.guithomas.springbootmysql")
@EntityScan(basePackageClasses = "br.com.guithomas.springbootmysql.model")
public class SpringBootMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlApplication.class, args);
	}

}
