/*
 ** created by: jorge.lessa
 */

public class FabricaPc implements FabricaAbstrata {

    @Override
    public Requisito criarRequisitos()
    {
        return new RequisitoPc();
    }
}
