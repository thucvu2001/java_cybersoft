package cybersoft.java18.test;

import cybersoft.java18.javacore.FunctionConvention;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionConventionTest {
    @Test
    void shouldCheckSoChanWorkCorrecttly() {
        assertEquals(true, FunctionConvention.checkSoChan(2));
        assertEquals(false, FunctionConvention.checkSoChan(3));
    }
}
