package estudos.patterns.strategyshowcase.shipping;

public class Frete {
    public double calcula (String servico, double peso){
        if(servico.equals("pac")){
            Correios c = new Correios();
            return c.calcularRemessa(servico, peso);
        } else if( servico.equals("sedex")){
            Correios c = new Correios();
            return c.calcularRemessa(servico, peso);
        } else if( servico.equals("amazon")){
            Amazon am = new Amazon();
            return am.calcularEnvio(peso, 10d);
        } else if( servico.equals("aliexpress")){
            AliExpress al = new AliExpress();
            return al.calcularFrete("gratis", peso);
        } else {
            return 0d;
        }
    }
}
