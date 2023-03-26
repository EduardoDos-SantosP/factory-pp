package parte2;

import parte2.fabrica.FabricaAlimentosFesta;
import parte2.fabrica.FabricaBebidas;
import parte2.fabrica.FabricaSalgadinhos;
import parte2.produto.Alimento;

public class Main {
    public static void main(String[] args) {
        FabricaAlimentosFesta fabricaBebidas = new FabricaBebidas();
        Alimento cocaCola = fabricaBebidas.criarProdutoPrincipal();
        Alimento sprite = fabricaBebidas.criarProdutoSecundario();

        FabricaAlimentosFesta fabricaSalgadinhos = new FabricaSalgadinhos();
        Alimento doritos = fabricaSalgadinhos.criarProdutoPrincipal();
        Alimento ruffles = fabricaSalgadinhos.criarProdutoSecundario();

        cocaCola.consumir();
        sprite.consumir();
        doritos.consumir();
        ruffles.consumir();
    }
}
