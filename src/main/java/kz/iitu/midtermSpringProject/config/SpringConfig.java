package kz.iitu.midtermSpringProject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "kz.iitu.midtermSpringProject")
@PropertySource("application.properties")
@EnableJpaRepositories(basePackages = "kz.iitu.midtermSpringProject.repository")
public class SpringConfig {
}
