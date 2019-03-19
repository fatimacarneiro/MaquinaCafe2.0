import java.util.ArrayList;
import java.util.List;

public class itemReceita {
    List<Ingrediente> ingredientes = new ArrayList<>();

    public List<Ingrediente> itensReceita() {
        Ingrediente cafe = new Ingrediente(1, "Café", 5);
        ingredientes.add(cafe);

        Ingrediente leite = new Ingrediente(2, "Leite", 5);
        ingredientes.add(leite);

        Ingrediente chocolate = new Ingrediente(3, "Chocolate", 3);
        ingredientes.add(chocolate);

        Ingrediente limao = new Ingrediente(4, "Limão", 3);
        ingredientes.add(limao);

        Ingrediente acucar = new Ingrediente(5, "Açúcar", 100);
        ingredientes.add(acucar);


        return ingredientes;
        }


}
