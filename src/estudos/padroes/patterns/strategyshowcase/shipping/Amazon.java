package estudos.padroes.patterns.strategyshowcase.shipping;

public class Amazon{
    public double calcularEnvio(double peso, double valor){
        return valor+(peso*0.06); 
    }
}
