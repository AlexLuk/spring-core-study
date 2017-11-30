package quotes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.Thread.sleep;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        while (true) {
            sleep(100);
            context.getBean(Quoter.class).sayQuote();
        }

    }
}
