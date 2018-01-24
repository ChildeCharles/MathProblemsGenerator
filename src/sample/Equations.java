package sample;

import java.util.concurrent.ThreadLocalRandom;

public class Equations {

    public String linear_equation(){
        double a;
        double b;
        do{
            a = ThreadLocalRandom.current().nextDouble(-100, 100 + 1);
            b = ThreadLocalRandom.current().nextDouble(-100, 100 + 1);
            a = Math.round (a * 10.0) / 10.0;
            b = Math.round (b * 10.0) / 10.0;
            //System.out.println("Miejsce zerowe: "+ -b/a);
        } while(-b/a % 1 != 0 || a==0 || b==0 );
        String exercise = "Znajdź miejsca zerowe równania liniowego:\n";
        if(b < 0)
            return exercise+a+"x - "+-b+" = 0";
        else
            return exercise+a+"x + "+b+" = 0";

    }
    public String quadratic_equation(){
        double a;
        double b;
        double c;
        double x1 = 1/3;
        double x2 = 2/7;
        double sqrtdelta;
        do {
            a = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
            b = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
            c = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
            double delta = (b * b) - (4 * a * c);
            sqrtdelta = Math.sqrt(delta);
            if (delta > 0 && a!=0) {
                x1 = (-b - sqrtdelta) / (2 * a);
                x2 = (-b + sqrtdelta) / (2 * a);
                //System.out.println("Miejsca zerowe: " + x1 + " oraz " + x2);
            } else if (delta == 0 && a!=0) {
                x1 = -b / (2 * a);
                x2 = 0;
                //System.out.println("Podwójne miejsce zerowe: " + x1);
            }
        }while( a%1!=0 || c%1!=0 || a==0 || sqrtdelta%1 != 0 || x1%0.25!=0 || x2%0.25!=0) ;
        String exercise = "Znajdź miejsca zerowe poniższego równania kwadratowego:\n";
        String part1;
        String part2;
        if(b < 0){
            part1= "- "+-b;
        }else{
            part1= "+ "+b;
        }
        if(c < 0){
            part2= "- "+-c;
        }else{
            part2= "+ "+c;
        }
        return exercise+a+"x^2 "+part1+"x "+part2+" = 0";
    }
}
