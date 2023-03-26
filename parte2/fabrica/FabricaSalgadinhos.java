package parte2.fabrica;

import parte2.produto.Alimento;
import parte2.produto.Doritos;
import parte2.produto.Ruffles;

public class FabricaSalgadinhos implements FabricaAlimentosFesta {
    public Alimento criarProdutoPrincipal() {
        return new Doritos();
    }

    public Alimento criarProdutoSecundario() {
        return new Ruffles();
    }
}
