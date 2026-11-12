import colaborador.Vendedor;
import cliente.Cliente;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Vendedor> vendedores = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    public static void main(String[] args) {
        vendedores.add(new Vendedor("Ronaldo"));
        clientes.add(new Cliente("Patrick"));

        for(Cliente cli : cliente) {
            System.out.println("Cliente: " + cli.getNome());
        }
        for(Vendedor ven : vendedor) {
            System.out.println("Vendedor: " + ven.getNome());
        }
        
    }
}
