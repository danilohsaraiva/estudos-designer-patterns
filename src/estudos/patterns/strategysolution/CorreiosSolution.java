package estudos.patterns.strategysolution;

import estudos.patterns.strategysolution.StrategySolution.CalcularEnvio;

public class CorreiosSolution implements CalcularEnvio{

    @Override
    public double calculoEnvio(double peso) {
        return peso*0.5;
    }
}

