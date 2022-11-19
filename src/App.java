import estudos.patterns.strategyshowcase.shipping.AliExpress;
import estudos.patterns.strategysolution.AliExpressSolution;
import estudos.patterns.strategysolution.FreteSolution;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Testando utilização Strategy");

        FreteSolution f = new FreteSolution();
        AliExpressSolution  ali = new AliExpressSolution();
        f.setServios(ali);
        System.out.println(f.calcularFrete(50));
    }
}
