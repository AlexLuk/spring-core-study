package quotes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TerminatorQuoterTest {
    private ClassPathXmlApplicationContext context;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("context.xml");
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testSayQuote() throws Exception {
        context.getBean(TerminatorQuoter.class).sayQuote();
        assertThat(outContent.toString(), is("message = I'll be back\r\n"));
    }
}