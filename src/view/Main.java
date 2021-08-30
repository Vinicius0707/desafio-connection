package view;

import data.funcionarioDAO;
import data.sistemaDAO;
import model.funcionario;
import model.sistema;

public class Main {
    public static void main(String[] args){
        funcionarioDAO dao = new funcionarioDAO();
        sistemaDAO DAO = new sistemaDAO();
    
        for(funcionario f: dao.listar()){
            System.out.println(f.toString());
        }
        for(sistema s: DAO.listar()){
            System.out.println(s.toString());
        }
    }
}
