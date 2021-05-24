package Class;

/**
 *
 * @author Sábia
 */
public class CalculoVelocidadeClass {

    private Double velocidadeinicial;
    private Double velocidadefinal;
    private Double espacoInicial;
    private Double espacoFinal;
    private Double tempoInicial;
    private Double tempoFinal;
    private Double aceleracao;

    public CalculoVelocidadeClass() {
    }

    public Double getEspacoInicial() {
        return this.espacoInicial;
    }

    public Double getTempoInicial() {
        return this.tempoInicial;
    }

    public Double getEspacoFinal() {
        return this.espacoFinal;
    }

    public Double getTempoFinal() {
        return this.tempoFinal;
    }

    public Double getVelocidadeInicial() {
        return this.velocidadeinicial;
    }

    public Double getVelocidadeFinal() {
        return this.velocidadefinal;
    }

    public Double getAceleracao() {
        return this.aceleracao;
    }

    public void setAceleracao(Double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public void setEspacoInicial(Double espacoInicial) {
        this.espacoInicial = espacoInicial;
    }

    public void setTempoInicial(Double tempoInicial) {
        this.tempoInicial = tempoInicial;
    }

    public void setEspacoFinal(Double espacoFinal) {
        this.espacoFinal = espacoFinal;
    }

    public void setTempoFinal(Double tempoFinal) {
        this.tempoFinal = tempoFinal;
    }

    public void setVelocidadeInicial(Double velocidadeinicial) {
        this.velocidadeinicial = velocidadeinicial;
    }

    public void setVelocidadeFinal(Double velocidadefinal) {
        this.velocidadefinal = velocidadefinal;
    }

    public Double media(double val1, double val2, double val3, double val4) {
        return ((val1 - val2) / (val3 - val4));
    }

    public Double media2(double val1, double val2, double val3, double val4) {
        return ((val1 - val2) * (val3 - val4));
    }

    public Double aux(double val1, double val2) {
        return ((val1 - val2));
    }

    public Double aux2(double val3, double val4) {
        return ((val3 * val4));
    }

    public Double aux3(double val3, double val4) {
        return ((val3 / val4));
    }

    public Double aux4(double val1, double val2) {
        return ((val1 + val2));
    }
    public Double aux5(double val1, double val2, double val3) {
        return ((val1 + val2 + val3));
    }

    public Double CalculoFHVMvelocidadeFinal(double a, double vo, double t){
        double resposta;
        resposta = vo + a * t;
        return resposta;
    }
    
    public Double CalculoFHVMvelocidadeInicial(double a, double t, double v){
        double resposta;
        resposta = (a * t) - v;
        return resposta;
    }
    
    public Double CalculoFHVMtempo(double v , double vo, double g){
        double resposta;
        resposta = (v-vo)/g;
        return resposta;
    }
    
    public Double FHPFTMVCalcularAlturaFinal(double ho, double vo, double t, double g){
        double resposta;
        resposta = ho+vo*t+0.5*g*(t*t);
        return resposta;
    }
    
    public Double FHPFTMVCalcularAlturaInicial(double h, double vo, double t, double g){
        double resposta;
        resposta = ((h*(-1)) + vo * t + 0.5*g*(t*t)*-1);
        return resposta;
    }
    
    public Double FHPFTMVCalcularVelocidadeIncial(double ho, double h, double g, double t){
        double resposta;
        resposta = (ho - h + (g*(t*t)/2))/t;
        return resposta;
    }
}
