package parte2.fabrica;

import parte2.produto.Alimento;
import parte2.produto.CocaCola;
import parte2.produto.Sprite;

public class FabricaBebidas implements FabricaAlimentosFesta {
    public Alimento criarProdutoPrincipal() {
        return new CocaCola();
    }

    public Alimento criarProdutoSecundario() {
        return new Sprite();
    }
}
