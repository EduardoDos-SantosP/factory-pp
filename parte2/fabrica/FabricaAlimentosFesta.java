package parte2.fabrica;

import parte2.produto.Alimento;

public interface FabricaAlimentosFesta {
    Alimento criarProdutoPrincipal();
    Alimento criarProdutoSecundario();
}
