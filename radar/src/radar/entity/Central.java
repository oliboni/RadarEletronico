package radar.entity;

public class Central {
    private int id;
    private String nome;
    private String local;
    private Radar radar = new Radar();
	private static Central instancia;
    
	private Central(){ 
	}
    
    public Central(int id, String nome, String local, Radar radar) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.radar = radar;
    }
    
    //Padrão Singleton, este parâmetro garante que a classe tenha apenas uma instância e fornece um ponto de acesso a instância 
    public static Central getInstance(){
		if( instancia == null )
			instancia = new Central();
			return instancia;
	}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public Radar getRadar() {
        return radar;
    }
    
}

