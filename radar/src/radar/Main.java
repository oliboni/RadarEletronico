package radar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import radar.controller.MultaController;
import radar.controller.RadarController;
import radar.entity.Central;
import radar.entity.Multa;
import radar.entity.Proprietario;
import radar.entity.Radar;
import radar.entity.Sensor;
import radar.entity.Veiculo;

public class Main {
	
	public static void main(String[] args) {
		
		//Enter data using BufferReader 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        
        RadarController radarController = new RadarController();
        MultaController multaController = new MultaController();
        double percentual = 0.0;
        Proprietario p1 = new Proprietario(1, "João da Silva", 23, "123.312.213-98", "324324234");
        Proprietario p2 = new Proprietario(2, "Maria da Silva", 19, "364.876.200-11", "98768645");
        Proprietario p3 = new Proprietario(3, "José Pedro", 39, "685.322.568-33", "63310112");
        
        try {
        	System.out.println("Veículos: ");
            System.out.println("1 - Golf 1.6");
            System.out.println("2 - Gol 1.6");
            System.out.println("3 - Fusca");
            System.out.print("Selecione o veículo: "); 
            int veiculo = Integer.parseInt(reader.readLine());
            System.out.println("\n");
            
            System.out.println("Informe a velocidade permitida na via: ");
            double velocidadePermitida = Double.parseDouble(reader.readLine());
            
        	System.out.print("Informe o tempo (segundos) demorado para passar pelo Radar desde a primeira até a ultima faixa: ");
            double tempo = Double.parseDouble(reader.readLine());
            Sensor sensor = new Sensor(1, "Sensor 1", tempo);
            
            Date dataHoraAtual = new Date();
            String data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dataHoraAtual);
            final Radar radar = new Radar(1, sensor, null, "Chapecó", data, velocidadePermitida, new Double(0), new Double(0));
            
            double velocidadeVeiculo = radarController.calculaVelocidade(tempo);
            System.out.println("Velocidade veículo: " + velocidadeVeiculo + " km/h");
            
            if (velocidadeVeiculo > velocidadePermitida) {
            	percentual = radarController.calculaPercentual(velocidadePermitida, velocidadeVeiculo);
            	System.out.println("Percentual acima da velocidade: " + percentual + " %");
            }
            
            if (percentual > 9.0) {
            	Central central = new Central(1, "Central 1", "Bairro A - Chapecó SC", radar);
            	
            	Veiculo v = new Veiculo(3, "VW", "Fusca", 1990, "MKI1793", p3);
            	if (veiculo==1) {
            		v = new Veiculo(1, "VW", "Golf 1.6", 2012, "ACG5598", p1);
            	} else if(veiculo==2) {
            		v = new Veiculo(2, "VW", "Gol 1.6", 2018, "MXG9986", p2);
            	}
            	Multa multa = new Multa(1, central, v);
            	multaController.gerarMulta(multa);
            	
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}

}
