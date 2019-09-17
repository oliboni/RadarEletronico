package radar.entity;

public class Multa {
    private int id;
    private Central central;
    private Veiculo veiculo;
    
    @Deprecated
    public Multa() {
    }
    
    public Multa(int id, Central central, Veiculo veiculo) {
        this.id = id;
        this.central = central;
        this.veiculo = veiculo;
    }

    public int getId() {
        return id;
    }

    public Central getCentral() {
        return central;
    }

    public void setCentral(Central central) {
        this.central = central;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
