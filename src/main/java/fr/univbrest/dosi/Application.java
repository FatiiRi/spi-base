package fr.univbrest.dosi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan
@EnableAutoConfiguration
@Configuration
@EnableJpaRepositories
@EnableTransactionManagement
@Import(RepositoryRestMvcConfiguration.class)
public class Application extends WebMvcConfigurerAdapter {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
