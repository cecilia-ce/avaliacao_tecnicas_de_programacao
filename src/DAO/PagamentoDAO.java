package DAO;

import Model.Pagamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagamentoDAO {
    
    public void salvarPagamento (Pagamento pagamento){
        Connection connection = MysqlConnect.getConection();
        PreparedStatement statement = null;
        String sql = " insert into pagamento (parcela, valorPago, diaVencimento, valorHonorario) values(?,?,?,?) ";
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, pagamento.getParcela());
            statement.setDouble(2, pagamento.getValor_pago());
            statement.setInt(3, pagamento.getDia_vencimento());    
            statement.setDouble(4, pagamento.getValor_honorario());
            statement.executeUpdate();
            
        }catch (SQLException e){

        }finally {
            MysqlConnect.closeConnection(connection, statement);
        }
    }
    
    
    
}
