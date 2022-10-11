package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {

    @Test
    void deveRetornarExcecaoParaCarroSemModelo() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setMarca("Ford")
                    .setPlaca("ABC1234")
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Modelo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCarroSemMarca() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("Citroen")
                    .setPlaca("ABC1234")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Marca inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarCarroValido() {
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setModelo("Citroen")
                .setPlaca("ABC1234")
                .setMarca("Ford")
                .build();

        assertNotNull(carro);
    }
}