package data;

import model.funcionario;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class funcionarioDAO extends funcionario {
    //metodo que lista os dados da tabela funcionarios no banco de dados
    public List<funcionario> listar(){
        List<funcionario> funcionarios = new ArrayList<funcionario>();
        
        try {
            //objeto de conexão
            Connection con = new conexao().getConnection();
            PreparedStatement smt = con.prepareStatement("select * from Funcionarios where \"status\" = 'Ativo';");
            ResultSet rs = smt.executeQuery();
            
            while(rs.next()) {
                funcionario f = new funcionario();
                
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setStatus(rs.getString("status"));
                f.setCargo(rs.getString("cargo"));
                
                funcionarios.add(f);
            }
            
            rs.close();
            smt.close();
            con.close();
            
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        
        return funcionarios;
    }
}
