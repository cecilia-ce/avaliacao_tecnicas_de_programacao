package DAO;

import Model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

    public void salvarCliente (Cliente cliente){
        Connection connection = MysqlConnect.getConection();
        PreparedStatement statement = null;
        String sql = " insert into cliente (nomeCompleto, cpf, endereco, estadoCivil, naturalidade,cep) values(?,?,?,?,?,?) ";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf());
            statement.setString(3, cliente.getEndereco());
            statement.setString(4, String.valueOf(cliente.getEstadoCivil()));
            statement.setString(5, cliente.getNaturalidade());
            statement.setString(6, cliente.getCep());

            statement.executeUpdate();
        }catch (SQLException e){

        }finally {
            MysqlConnect.closeConnection(connection, statement);
        }
    }

}
