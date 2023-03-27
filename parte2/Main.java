package parte2;

import parte2.fabrica.FabricaAlimentosFesta;
import parte2.fabrica.FabricaBebidas;
import parte2.fabrica.FabricaDocinhos;
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

        FabricaAlimentosFesta fabricaDocinhos = new FabricaDocinhos();
        Alimento brigadeiro = fabricaDocinhos.criarProdutoPrincipal();
        Alimento beijinho = fabricaDocinhos.criarProdutoSecundario();

        cocaCola.consumir();
        sprite.consumir();
        doritos.consumir();
        ruffles.consumir();
        brigadeiro.consumir();
        beijinho.consumir();
    }
}
