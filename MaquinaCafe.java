import java.util.Scanner;

public class MaquinaCafe {

    Estoque estoque = new Estoque();


    int direcionaUsuario;
    public int menuOuEstoque(){
        System.out.println("Olá! Deseja realizar uma compra? Digite 1 para SIM e 2  para NÃO.");
        Scanner menuOuEstoque = new Scanner(System.in);
        direcionaUsuario = menuOuEstoque.nextInt();

        return direcionaUsuario;
    }

    public void direcionaParaEstoque(){
        if (direcionaUsuario == 2) {
            System.out.println("\n" + "Para continuar, digite sua senha");
            int senha;
            Scanner pegaSenha = new Scanner(System.in);
            senha = pegaSenha.nextInt();

            if (senha == 123) {
                estoque.mostraEstoque();
                estoque.desejaAlterarEstoque();
                estoque.adicionarEstoque();
                estoque.adicionaItemEstoque();

            } else {
                System.out.println("\n" + "Senha incorreta! Redirecionando usuário para Menu de compras");
            }
        }
    }
}
