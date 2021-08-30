package model;

public class sistema {
    private int id;
    private String nome;
    private String empresa;
    private String responsavel;

    
    //getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getResponsavel() {
        return responsavel;
    }
    
    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "sistema{" + "id=" + id + ", nome=" + nome + ", empresa=" + empresa + ", responsavel=" + responsavel + '}';
    }
    
    
}
