import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

public class JavaBaiscs {
    private String text = "Sum is:";

    @Test
    public void sumTwoDigits() {

        sumAndPrint(45, 90);
        sumAndPrint(1, 3);
        sumAndPrint(405, 900);

    }

    private void sumAndPrint(Integer a, Integer b){
        Integer c = a + b;
        System.out.println(text + "for int" + c );



    }
}
