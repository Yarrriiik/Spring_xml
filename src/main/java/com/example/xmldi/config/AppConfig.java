// com/example/xmldi/config/AppConfig.java
package com.example.xmldi.config;

import com.example.xmldi.box.Box;
import com.example.xmldi.contents.Contents;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.example.xmldi")
@PropertySource("classpath:app.properties")
public class AppConfig {

    // Обработчик плейсхолдеров для @Value
    @Bean
    public static PropertySourcesPlaceholderConfigurer props() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    // Фабричный метод: создаём бин Box через @Bean-метод
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Box bookBox(@Qualifier("bookContents") Contents contents) {
        return new Box(20, 10, 30, contents);
    }

    // Второй Box через тот же фабричный подход
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Box toyBox(@Qualifier("toyContents") Contents contents) {
        return new Box(15, 15, 15, contents);
    }
}
