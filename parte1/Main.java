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
        Movel armarioMadeira = fabricaMovelMadeira.criarArmario();
        cadeiraMadeira.montar();
        mesaMadeira.montar();
        armarioMadeira.montar();

        FabricaMovel fabricaMovelMetal = new FabricaMovelMetal();
        Movel cadeiraMetal = fabricaMovelMetal.criarCadeira();
        Movel mesaMetal = fabricaMovelMetal.criarMesa();
        Movel armarioMetal = fabricaMovelMetal.criarArmario();
        cadeiraMetal.montar();
        mesaMetal.montar();
        armarioMetal.montar();
    }
}
