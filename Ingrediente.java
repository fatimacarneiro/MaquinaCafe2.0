public class Ingrediente {
    int codigoIngrediente;
    String nomeIngrediente;
    int porcaoIngrediente;

        public Ingrediente(int codigoProduto, String nome, int porcao) {
            this.codigoIngrediente = codigoProduto;
            this.nomeIngrediente = nome;
            this.porcaoIngrediente = porcao;
        }
        public String toString(){
            return codigoIngrediente + " - " + nomeIngrediente + " - " + porcaoIngrediente;
        }
    }

