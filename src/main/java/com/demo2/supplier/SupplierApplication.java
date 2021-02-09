/*
 * created by 2019年7月9日 下午3:44:25
 */
package com.demo2.supplier;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author fangang
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.demo2"})
@ImportResource(locations={"classpath*:applicationContext-*.xml"})
@MapperScan("com.demo2.support.dao")
@EnableEurekaClient
public class SupplierApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SupplierApplication.class, args);
		System.out.println(".....................................");
		System.out.println("..The Supplier Application started...");
		System.out.println(".....................................");
	}

}
