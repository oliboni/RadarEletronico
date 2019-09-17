package radareletronico.entity;

public class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private Proprietario proprietario;
    
    @Deprecated
    public Veiculo() {
    }

    public Veiculo(int id, String marca, String modelo, int ano, String placa, Proprietario proprietario) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.proprietario = proprietario;
    }
    

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
   
    public String getPlaca() {
        return placa;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }
}
