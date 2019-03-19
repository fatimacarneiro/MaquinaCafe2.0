import java.util.ArrayList;
import java.util.List;

public class ItemEstoque {
    List<Ingrediente> itensEstoque = new ArrayList<>();

    public List<Ingrediente> criaItensEstoque() {

        Ingrediente poCafe = new Ingrediente(1, "Pó de Café", 5);
        itensEstoque.add(poCafe);

        Ingrediente leite = new Ingrediente(2, "Leite", 5);
        itensEstoque.add(leite);

        Ingrediente chocolate = new Ingrediente(3, "Chocolate", 3);
        itensEstoque.add(chocolate);

        Ingrediente limao = new Ingrediente(4, "Limão", 3);
        itensEstoque.add(limao);

        Ingrediente acucar = new Ingrediente(5, "Açúcar", 100);
        itensEstoque.add(acucar);

        Ingrediente copo = new Ingrediente(6, "Copo", 20);
        itensEstoque.add(copo);

        return itensEstoque;
    }

//    public int selecionarItemParaAdicionar(int itemQueSeraAdicionado) {
//
//        for (int i = 0; i < itensEstoque.size(); i++) {
//
//            Ingrediente ingrediente = itensEstoque.get(i);
//
//            if(ingrediente.codigoIngrediente == itemQueSeraAdicionado){
//                return ingrediente.codigoIngrediente;
//            }
//
//        }
//
//
//        return itemQueSeraAdicionado;
//    }

//    public int totalItemEstoque(Ingrediente ingrediente) {
//        boolean retirada = false;
//        boolean entrada = false;
//        int valorRetirado = 0;
//        int valorAcrescentado = 0;
//
//        if (retirada == true) {
//            ingrediente.porcaoIngrediente = ingrediente.porcaoIngrediente - valorRetirado;
//        } else if (entrada == true) {
//            ingrediente.porcaoIngrediente = ingrediente.porcaoIngrediente + valorAcrescentado;
//        }
//
//        return ingrediente.porcaoIngrediente;
//    }
}