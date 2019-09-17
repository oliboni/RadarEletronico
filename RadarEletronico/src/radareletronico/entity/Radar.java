package radareletronico.entity;

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
    

    public void setId(int id) {
        this.id = id;
    }
    
    public Sensor getSensor() {
        return Sensor;
    }

    public void setSensor(Sensor Sensor) {
        this.Sensor = Sensor;
    }
   
    public MaquinaFotografica getMaquinaFotografica() {
        return maquinaFotografica;
    }
    
    public void setMaquinaFotografica(MaquinaFotografica maquinaFotografica) {
        this.maquinaFotografica = maquinaFotografica;
    }
    
    public String getLocal() {
        return local;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    public String getDataHora() {
        return dataHora;
    }
    
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public double getVelocidadePermitida() {
        return velocidadePermitida;
    }
    
    public void setVelocidadePermitida(double velocidadePermitida) {
        this.velocidadePermitida = velocidadePermitida;
    }

    public double getVelocidadeVeiculo() {
        return velocidadeVeiculo;
    }
    
    public void setVelocidadeVeiculo(double velocidadeVeiculo) {
        this.velocidadeVeiculo = velocidadeVeiculo;
    }
    
    public double getPercentualAcimaVelocidade() {
        return percentualAcimaVelocidade;
    }
    
    public void setPercentualAcimaVelocidade(double percentualAcimaVelocidade) {
        this.percentualAcimaVelocidade = percentualAcimaVelocidade;
    }      
}



