package estudos.patterns.strategyshowcase.shipping;

public class Correios {
    public double calcularRemessa(String servico, double peso){
        if(servico.equals("pac")){
            return peso*0.6;
        }else if(servico.equals("sedex")){
            return peso*0.5;
        } else {
            return 0d;
        }
    }
}
