package parte1;

import parte1.fabrica.FabricaMovel;
import parte1.fabrica.FabricaMovelMadeira;
import parte1.fabrica.FabricaMovelMetal;
import parte1.produto.Movel;

public class Main {
    public static void main(String[] args) {
        FabricaMovel fabricaMovelMadeira = new FabricaMovelMadeira();
        Movel cadeiraMadeira = fabricaMovelMadeira.criarCadeira();
        Movel mesaMadeira = fabricaMovelMadeira.criarMesa();
        cadeiraMadeira.montar();
        mesaMadeira.montar();

        FabricaMovel fabricaMovelMetal = new FabricaMovelMetal();
        Movel cadeiraMetal = fabricaMovelMetal.criarCadeira();
        Movel mesaMetal = fabricaMovelMetal.criarMesa();
        cadeiraMetal.montar();
        mesaMetal.montar();
    }
}
