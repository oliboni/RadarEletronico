package radareletronico.entity;

public class Sensor {
    private int id;
    private String nome;
    private double tempo;
    
    @Deprecated
    public Sensor() {
    }
    
    public Sensor(int id, String nome, double tempo) {
        this.id = id;
        this.nome = nome;
        this.tempo = tempo;
    }
    

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getTempo() {
        return tempo;
    }
}
