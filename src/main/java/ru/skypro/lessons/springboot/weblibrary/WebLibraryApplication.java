package ru.skypro.lessons.springboot.weblibrary;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@OpenAPIDefinition
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WebLibraryApplication {

    public static void main(String[] args){
        SpringApplication.run(WebLibraryApplication.class, args);
    }

}
