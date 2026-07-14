package control;

import java.util.ArrayList;
import model.Cliente;

public class ControleCliente {

    static ArrayList<Cliente> clientes = new ArrayList<>();
     
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public boolean removeCliente(Cliente cliente) {
        return clientes.remove(cliente);
    }

    public Cliente pesquisarCliente(String cpf) {
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Cliente> getCliente() {
        return clientes;
    }

    public boolean validarCliente(String cpf) {
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

}
