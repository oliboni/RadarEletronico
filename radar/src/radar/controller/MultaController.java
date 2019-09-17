package radar.controller;

import radar.entity.Multa;

public class MultaController {
    
    public void gerarMulta(Multa multa) {
    	System.out.println("MULTA: " + multa.getId()
    			+ "\nDATA/HORA: " + multa.getCentral().getRadar().getDataHora()
    			+ "\nVELOCIDADE PERMITIDA: " + multa.getCentral().getRadar().getVelocidadePermitida()
    			+ "\nVELOCIDADE NA VIA: " + multa.getCentral().getRadar().getVelocidadeVeiculo()
    			+ "\nPERCENTUAL ACIMA DA VELOCIDADE: " + multa.getCentral().getRadar().getPercentualAcimaVelocidade()
    			+ "\nLOCAL: " + multa.getCentral().getLocal()
    			+ "\nPLACA VEÍCULO: " + multa.getVeiculo().getPlaca()
    			+ "\nMARCA VEÍCULO: " + multa.getVeiculo().getMarca()
    			+ "\nMODELO VEÍCULO: " + multa.getVeiculo().getModelo()
    			+ "\nANO VEÍCULO: " + multa.getVeiculo().getAno()
    			+ "\nPROPRIETÁRIO VEÍCULO: " + multa.getVeiculo().getProprietario().getNome()
    			+ "\nCPF PROPRIETÁRIO VEÍCULO: " + multa.getVeiculo().getProprietario().getCpf()
    			);
    }

}
