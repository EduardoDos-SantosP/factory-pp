package parte1.fabrica;

import parte1.produto.CadeiraMadeira;
import parte1.produto.MesaMadeira;
import parte1.produto.Movel;

public class FabricaMovelMadeira implements FabricaMovel {
    @Override
    public Movel criarCadeira() {
        return new CadeiraMadeira();
    }

    @Override
    public Movel criarMesa() {
        return new MesaMadeira();
    }
}
