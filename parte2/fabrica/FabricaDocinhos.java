package parte2.fabrica;

import parte2.produto.Alimento;
import parte2.produto.Beijinho;
import parte2.produto.Brigadeiro;

public class FabricaDocinhos implements FabricaAlimentosFesta {
    public Alimento criarProdutoPrincipal() {
        return new Brigadeiro();
    }

    public Alimento criarProdutoSecundario() {
        return new Beijinho();
    }
}
