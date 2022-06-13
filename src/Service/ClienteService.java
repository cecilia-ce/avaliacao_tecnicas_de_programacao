package Service;

import DAO.ClienteDAO;
import Model.Cliente;
import Enum.EstadoCivil;

public class ClienteService {
    public static void salvarCliente(String nomeCompleto, String cpf, String endereco, EstadoCivil estadoCivil, String naturalidade, String cep){

        Cliente cliente = new Cliente(nomeCompleto,cpf,endereco,estadoCivil,naturalidade,cep);
        ClienteDAO clienteDAO = new ClienteDAO();

        clienteDAO.salvarCliente(cliente);

    }

}
