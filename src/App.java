import estudos.patterns.singleton.CanalYoutube;
import estudos.patterns.singleton.HospedarCanal;
import estudos.patterns.strategysolution.AliExpressSolution;
import estudos.patterns.strategysolution.FreteSolution;
import estudos.patterns.strategysolution.StrategySolution.CalcularEnvio;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nTestando utilização Strategy");
        
        FreteSolution f = new FreteSolution();
        AliExpressSolution  ali = new AliExpressSolution();
        f.setServios(ali);
        System.out.println(f.calcularFrete(50));

        System.out.println("\n------------------------------\n");
        System.out.println("Testando Sigleton");
        
        
        HospedarCanal hospedagem1 = HospedarCanal.getInstancia();
        HospedarCanal hospedagem2 = HospedarCanal.getInstancia();
       
       // para testar os endereços de memória é necessário comentar o método toString em HospedarCanal
        System.out.println("Endereço de memória hospedagem1: " + hospedagem1);
        System.out.println("Endereço de memória hospedagem2: " + hospedagem2);

        CanalYoutube canal1 = new CanalYoutube("DigitalInnovationOne", "dio");
        CanalYoutube canal2 = new CanalYoutube("Codigo Fonte Tv", "codigotv");
        CanalYoutube canal3 = new CanalYoutube("Filipe Deschamps", "deschamps");

        hospedagem1.setCanais(canal1);
        hospedagem2.setCanais(canal3);
        hospedagem1.setCanais(canal2);
        
        System.out.println("\nCanais adicionados");
        System.out.println(hospedagem1.getCanais());
     
    }
}
