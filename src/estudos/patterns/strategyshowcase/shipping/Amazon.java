package estudos.patterns.strategyshowcase.shipping;

public class Amazon{
    public double calcularEnvio(double peso, double valor){
        return valor+(peso*0.06); 
    }
}
