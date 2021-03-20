package ru.evgeny13.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.evgeny13.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
