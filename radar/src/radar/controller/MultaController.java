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
    			+ "\nPLACA VE�CULO: " + multa.getVeiculo().getPlaca()
    			+ "\nMARCA VE�CULO: " + multa.getVeiculo().getMarca()
    			+ "\nMODELO VE�CULO: " + multa.getVeiculo().getModelo()
    			+ "\nANO VE�CULO: " + multa.getVeiculo().getAno()
    			+ "\nPROPRIET�RIO VE�CULO: " + multa.getVeiculo().getProprietario().getNome()
    			+ "\nCPF PROPRIET�RIO VE�CULO: " + multa.getVeiculo().getProprietario().getCpf()
    			);
    }

}
