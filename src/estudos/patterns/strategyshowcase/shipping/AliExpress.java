package estudos.patterns.strategyshowcase.shipping;

public class AliExpress {
    public double calcularFrete(String cupom, double pesoProduto){
        
        if(cupom.equals("Gratis")){
            return 0d;
        } else {
            return pesoProduto*0.3;
        }
    }
}
