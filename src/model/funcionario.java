package model;

public class funcionario {
    private int id;
    private String nome;
    private String status;
    private String cargo;

    
    //getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        return status;
    }

    public String getCargo() {
        return cargo;
    }
    
    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "funcionario{" + "id=" + id + ", nome=" + nome + ", status=" + status + ", cargo=" + cargo + '}';
    }
    
    
    
}

