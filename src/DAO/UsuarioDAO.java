package DAO;

import Model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    
    public void salvarUsuario (Usuario usuario){
        Connection connection = MysqlConnect.getConection();
        PreparedStatement statement = null;
        String sql = " insert into usuario (login, senha, nome) values(?,?,?) ";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, usuario.getLogin());
            statement.setString(2, usuario.getSenha());
            statement.setString(3, usuario.getNome());    
            statement.executeUpdate();
            
        }catch (SQLException e){

        }finally {
            MysqlConnect.closeConnection(connection, statement);
        }
    }
    
    
}
