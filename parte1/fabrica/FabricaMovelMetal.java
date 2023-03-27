package parte1.fabrica;

import parte1.produto.ArmarioMetal;
import parte1.produto.CadeiraMetal;
import parte1.produto.MesaMetal;
import parte1.produto.Movel;

public class FabricaMovelMetal implements FabricaMovel {
    @Override
    public Movel criarCadeira() {
        return new CadeiraMetal();
    }

    @Override
    public Movel criarMesa() {
        return new MesaMetal();
    }

    @Override
    public Movel criarArmario() {
        return new ArmarioMetal();
    }
}
