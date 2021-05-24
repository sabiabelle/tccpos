/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Kaju
 */
public class CalculoDinamicaClass {
    
    public Double CalcularForcaDinamica(Double aceleracao, Double massa){
        Double resposta = massa * aceleracao;
        return resposta;
    }
    
    public Double CalcularMassaDinamica(Double aceleracao, Double forca){
        Double resposta = forca/aceleracao;
        return resposta;
    }
    
    public Double CalcularAceleracaoDinamica(Double forca, Double massa){
        Double resposta = forca/massa;
        return resposta;
    }
}
