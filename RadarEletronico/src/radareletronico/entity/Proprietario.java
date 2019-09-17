package radareletronico.entity;

public class Proprietario {
    private int id;
    private String nome;
    private int idade;
    private String cpf;
    private String cnh;
        
    @Deprecated
    public Proprietario() {
    }

    public Proprietario(int id, String nome, int idade, String cpf, String cnh) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cnh = cnh;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

}
