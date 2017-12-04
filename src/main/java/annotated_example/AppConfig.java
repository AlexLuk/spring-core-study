package annotated_example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("annotated_example")
public class AppConfig {
    @Bean
    public MyBean myBean(){
        return new MyBeanImpl();
    }
}
