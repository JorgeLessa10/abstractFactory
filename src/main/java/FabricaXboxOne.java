/*
 ** created by: jorge.lessa
 */

public class FabricaXboxOne implements FabricaAbstrata
{
    @Override
    public Requisito criarRequisitos()
    {
        return new RequisitoXboxOne();
    }
}
