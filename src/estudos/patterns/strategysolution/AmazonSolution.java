package estudos.padroes.patterns.strategysolution;

import estudos.padroes.patterns.strategysolution.StrategySolution.CalcularEnvio;

public class AmazonSolution implements CalcularEnvio{

    @Override
    public double calculoEnvio(double peso) {
        return peso*0.7;
    }

}