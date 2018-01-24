package sample;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateProblem {
    Equations equations = new Equations();
    Probability probability = new Probability();
    Series series = new Series();
    Percentages percentages = new Percentages();
    public String start(String problem){
        String problemString = "";
        if(problem == null){return "Nie wybrano typu zadania.";}
        switch (problem){
            case "Równania liniowe": problemString = equations.linear_equation();
                break;
            case "Równania kwadratowe": problemString = equations.quadratic_equation();
                break;
            case "Probabilistyka": problemString = probability.calculus_of_probability();
                break;
            case "Ciągi liczbowe": problemString = series.series();
                break;
            case "Procenty": problemString = percentages.percentages();
                break;
        }
        return problemString;
    }


}
