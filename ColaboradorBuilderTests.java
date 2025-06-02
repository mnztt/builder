import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColaboradorBuilderTests {
    @Test
    void deveRetornarExcecaoParaColaboradorSemMatricula() {
        try {
            ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
            Colaborador colaborador = colaboradorBuilder
                    .setNome("Colaborador 1")
                    .setEmail("colaborador@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Matrícula inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaColaboradorSemNome() {
        try {
            ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
            Colaborador colaborador = colaboradorBuilder
                    .setMatricula(1)
                    .setEmail("colaborador@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarColaboradorValido() {
        ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
        Colaborador colaborador = colaboradorBuilder
                .setMatricula(1)
                .setNome("Aluno 1")
                .setEmail("aluno1@email.com")
                .build();

        assertNotNull(colaborador);
    }
}
