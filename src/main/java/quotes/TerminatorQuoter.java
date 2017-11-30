package quotes;

import lombok.Getter;
import lombok.Setter;

public class TerminatorQuoter implements Quoter {

    @Getter
    @Setter
    private String message;

    @Override
    public void sayQuote() {
        System.out.println("message = " + message);
    }
}
