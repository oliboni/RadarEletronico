package radareletronico.controller;

public class RadarController {
    
    public double calculaVelocidade(double tempo) {
    	return (1.5/tempo) * 3.6;
    }
    
    public double calculaPercentual(double velPermitida, double velVeiculo) {
    	return (((velPermitida - velVeiculo) / velPermitida) * 100) * -1;
    }

}
