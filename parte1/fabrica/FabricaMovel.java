package parte1.fabrica;

import parte1.produto.Movel;

public interface FabricaMovel {
    Movel criarCadeira();

    Movel criarMesa();
}
