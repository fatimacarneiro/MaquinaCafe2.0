import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {

    Ingrediente ingrediente;
    ItemEstoque itemEstoque = new ItemEstoque();


    private ArrayList<Ingrediente> geraEstoque() {


        return itemEstoque.criaItensEstoque();
    }

    public void mostraEstoque() {
        ArrayList<Ingrediente> listaEstoque = new ArrayList<>();
        listaEstoque = geraEstoque();

        listaEstoque.forEach(ingrediente -> {
            System.out.println("\n" + ingrediente.codigoIngrediente + " - " + ingrediente.nomeIngrediente + " - Contém " + ingrediente.porcaoIngrediente + " unidades.");

        });
    }


    int desejaAlterar;

    public int desejaAlterarEstoque() {
        System.out.println("\n" + "Deseja adicionar adicionar itens ao estoque? Digite 1 para SIM e 2 para NÃO ");
        Scanner alterarEstoque = new Scanner(System.in);
        desejaAlterar = alterarEstoque.nextInt();

        return desejaAlterar;
    }

    int itemQueSeraAdicionado;
    int adicionarItem = 0;
    Ingrediente itemEscolhido;


    public void adicionarEstoque() {

        if (desejaAlterar == 1) {
            System.out.println("\n" + "Digite o código do produto que você irá repor. ");
            Scanner alterarItemEstoque = new Scanner(System.in);
            itemQueSeraAdicionado = alterarItemEstoque.nextInt();
            if (itemQueSeraAdicionado != 1 && itemQueSeraAdicionado != 2 && itemQueSeraAdicionado != 3 && itemQueSeraAdicionado != 4 && itemQueSeraAdicionado != 5) {
                System.out.println("Opção inválida. Favor digitar o número que antecede o produto. Exemplo: para escolher Café, digite 1");
            }
            else{
                itemEscolhido =  itemEstoque.selecionarItemParaAdicionar(itemQueSeraAdicionado);
            }


        }
    }

    int valorAdicionado = 0;
    public void adicionaItemEstoque() {

        System.out.println("\n" + "Você selecionou o " + itemEscolhido.nomeIngrediente + "\n" + "Digite o número de porções que deseja adicionar");
        Scanner adicionaEstoque = new Scanner(System.in);
        valorAdicionado = adicionaEstoque.nextInt();

        itemEscolhido.porcaoIngrediente = itemEscolhido.porcaoIngrediente + valorAdicionado;

        System.out.println("A nova quantidade total de " + itemEscolhido.nomeIngrediente + " é de " + itemEscolhido.porcaoIngrediente);
    }
    
}