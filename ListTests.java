import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> pump = new ArrayList<>();
        Collections.addAll(pump,"mokney", "donkey", "funk", "bum", "homeless");
        assertArrayEquals("monkey", ListExamples(pump, "monkey"));
    }
}
