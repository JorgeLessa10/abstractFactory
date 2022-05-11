/*
 ** created by: jorge.lessa
 */

public class FabricaPs4 implements FabricaAbstrata
{
    @Override
    public Requisito criarRequisitos()
    {
        return new RequisitoPs4();
    }
}
