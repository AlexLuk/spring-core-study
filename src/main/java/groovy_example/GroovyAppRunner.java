package groovy_example;

import org.springframework.context.support.GenericGroovyApplicationContext;

public class GroovyAppRunner {
    public static void main(String[] args) {
        GenericGroovyApplicationContext context = new GenericGroovyApplicationContext("context.groovy");
        Bread bean = context.getBean("myBean",Bread.class);
        bean.slice();
    }
}
