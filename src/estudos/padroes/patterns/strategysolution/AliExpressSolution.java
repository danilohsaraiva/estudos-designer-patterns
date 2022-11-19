package estudos.padroes.patterns.strategysolution;

import estudos.padroes.patterns.strategysolution.StrategySolution.CalcularEnvio;

public class AliExpressSolution implements CalcularEnvio {

    @Override
    public double calculoEnvio(double peso) {
        return peso*0.6;
    }
}