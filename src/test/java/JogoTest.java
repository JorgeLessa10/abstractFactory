import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
** created by: jorge.lessa
*/

class JogoTest {

    @Test
    void obterRequisitosPC()
    {
        FabricaAbstrata fabrica = new FabricaPc();
        Jogo jogo = new Jogo(fabrica);
        assertEquals("Esses são os requisitos para o jogo rodar no computador", jogo.obterRequisitos());
    }

    @Test
    void obterRequisitosPs4()
    {
        FabricaAbstrata fabrica = new FabricaPs4();
        Jogo jogo = new Jogo(fabrica);
        assertEquals("Esses são os requisitos para o jogo rodar no PS4", jogo.obterRequisitos());
    }

    @Test
    void obterRequisitosXboxOne()
    {
        FabricaAbstrata fabrica = new FabricaXboxOne();
        Jogo jogo = new Jogo(fabrica);
        assertEquals("Esses são os requisitos para o jogo rodar no Xbox One", jogo.obterRequisitos());
    }
}