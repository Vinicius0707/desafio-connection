
package data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import model.sistema;

public class sistemaDAO extends sistema{
    public List<sistema> listar(){
        List<sistema> sistemas = new ArrayList<sistema>();
        
        try {
            Connection con = new conexao().getConnection();
            PreparedStatement smt = con.prepareStatement("select * from Sistemas;");
            ResultSet rs = smt.executeQuery();
            
            while(rs.next()) {
                sistema s = new sistema();
                
                s.setId(rs.getInt("id"));
                s.setNome(rs.getString("nome"));
                s.setEmpresa(rs.getString("empresa"));
                s.setResponsavel(rs.getString("responsavel"));
                
                sistemas.add(s);
            }
            
            rs.close();
            smt.close();
            con.close();
            
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        
        return sistemas;
    }
}
