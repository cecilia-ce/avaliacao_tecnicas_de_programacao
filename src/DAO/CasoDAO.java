package DAO;

import Model.Caso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CasoDAO {
    
    public void salvarCaso (Caso caso){
        Connection connection = MysqlConnect.getConection();
        PreparedStatement statement = null;
        String sql = " insert into caso (tipo_de_servico, valor_dos_honorarios, parcelas, data_vencimento, descricao) values(?,?,?,?,?) ";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, caso.getTipo_de_servico());
            statement.setDouble(2, caso.getValor_dos_honorarios());
            statement.setString(3, caso.getData_vencimento());
            statement.setString(3, caso.getDescricao());
            
            statement.executeUpdate();
            
        }catch (SQLException e){

        }finally {
            MysqlConnect.closeConnection(connection, statement);
        }
    }
    
    
}
