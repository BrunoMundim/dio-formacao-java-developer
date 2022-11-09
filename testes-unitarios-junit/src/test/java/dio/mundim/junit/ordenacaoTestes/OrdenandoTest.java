package dio.mundim.junit.ordenacaoTestes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrdenandoTest {


    //@Order(4)
    @DisplayName("Usei display name aqui")
    @Test
    void validaFluxoA(){
        assertTrue(true);
    }

    //@Order(2)
    @Test
    void validaFluxoB(){
        assertTrue(true);
    }

    //@Order(1)
    @Test
    void validaFluxoC(){
        assertTrue(true);
    }

    //@Order(3)
    @Test
    void validaFluxoD(){
        assertTrue(true);
    }

}
