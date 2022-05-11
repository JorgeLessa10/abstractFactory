/*
 ** created by: jorge.lessa
 */

public class Jogo {

    private Requisito requisito;

    public Jogo (FabricaAbstrata fabrica)
    {
        this.requisito = fabrica.criarRequisitos();
    }

    public String obterRequisitos()
    {
        return this.requisito.obter();
    }
}
