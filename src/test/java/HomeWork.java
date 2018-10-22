import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork {
    private double loanAmount = 1000;
    private double amountToPay = 5100;

    @Test
    public void myTest() {

        double sum, sum1, sum2, sum3;

        sum1 = (loanAmount * (1 + 10 * 0.1));
        sum2 = (loanAmount * (1 + 10 * 0.08));
        sum3 = (loanAmount * (1 + 10 * 0.06));

         sum = sum1 + sum2 + sum3;

        Assertions.assertEquals(amountToPay,sum,"amountToPay is incorrect!");


    }
}