package dio.mundim.junit.assumptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void validarAlgoSomenteNoUsuarioBruno(){
        Assumptions.assumeTrue("bruno".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }

}
