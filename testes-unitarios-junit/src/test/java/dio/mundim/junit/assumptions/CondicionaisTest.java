package dio.mundim.junit.assumptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


public class CondicionaisTest {

    @Test
    // @EnabledIfEnvironmentVariable(named = "USER", matches = "bruno")  linux
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    void validarAlgoSomenteNoUsuarioBruno(){
        Assertions.assertEquals(2, 1+1);
    }

}
