package estudos.padroes.patterns.strategysolution;

import estudos.padroes.patterns.strategysolution.StrategySolution.CalcularEnvio;

public class FreteSolution{
    private CalcularEnvio servico;

    public void setServios(CalcularEnvio servico){
        this.servico = servico;
    }

    public double calcularFrete(double peso){
        double a = this.servico.calculoEnvio(peso);
        return a;
    }
}