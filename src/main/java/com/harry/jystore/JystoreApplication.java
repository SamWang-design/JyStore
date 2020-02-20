package com.harry.jystore;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.harry.jystore.dao")
@EnableCaching
@EnableSwagger2
public class JystoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(JystoreApplication.class, args);
    }

}
