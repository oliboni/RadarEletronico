package radar.entity;

public class Radar {
    
    private int id;
    private Sensor Sensor;
    private MaquinaFotografica maquinaFotografica;
    private String local;
    private String dataHora;
    private double velocidadePermitida;
    private double velocidadeVeiculo;
    private double percentualAcimaVelocidade;
    
    public Radar() {
    }

    public Radar(final Integer id, 
    			 final Sensor Sensor,
				 final MaquinaFotografica maquinaFotografica, 
				 final String local, 
				 final String dataHora, 
				 final Double velocidadePermitida, 
				 final Double velocidadeVeiculo,
				 final double percentualAcimaVelocidade) {
        this.id = id;
        this.Sensor = Sensor;
        this.maquinaFotografica = maquinaFotografica;
        this.local = local;
        this.dataHora = dataHora;
        this.velocidadePermitida = velocidadePermitida;
        this.velocidadeVeiculo = velocidadeVeiculo;
        this.percentualAcimaVelocidade = percentualAcimaVelocidade;
    }

    
    public int getId() {
        return id;
    }

    public Sensor getSensor() {
        return Sensor;
    }

    public MaquinaFotografica getMaquinaFotografica() {
        return maquinaFotografica;
    }

    public String getLocal() {
        return local;
    }

    public String getDataHora() {
        return dataHora;
    }

    public double getVelocidadePermitida() {
        return velocidadePermitida;
    }

    public double getVelocidadeVeiculo() {
        return velocidadeVeiculo;
    }

    public double getPercentualAcimaVelocidade() {
        return percentualAcimaVelocidade;
    }
}
