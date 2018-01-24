package sample;

import java.util.concurrent.ThreadLocalRandom;

public class Series {
    public String series(){
        int typeOfExercise = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        if(typeOfExercise == 1)
            return arithmeticSeries();
        else
            return geometricSeries();
    }
    public String arithmeticSeries() {
        int typeOfExercise = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        if(typeOfExercise == 1){
            int a = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
            int r;
            do{
                r  = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
            }while(r==0);
            int whichToLookFor = ThreadLocalRandom.current().nextInt(2, 20 + 1);
            int whichGiven;
            do{
                whichGiven = ThreadLocalRandom.current().nextInt(1, 8 + 1);
            }while(whichGiven == whichToLookFor);
            return "Wyznacz "+whichToLookFor+". wyraz ciągu arytmetycznego, wiedząc, że a"+whichGiven+" = "+a+", a r = "+r+".";
        } else {
            int a1 = ThreadLocalRandom.current().nextInt(-30, 30 + 1);
            int r;
            int an;
            do{
                an = ThreadLocalRandom.current().nextInt(-30, 30 + 1);
                r = ThreadLocalRandom.current().nextInt(-7, 7 + 1);
            }while(r==0 || (an-a1)%r!=0 || (a1 > an && r > 0) || (a1 < an  && r < 0));
            return "Wyznacz liczbę wyrazów ciągu arytmetycznego mając dane: a1 = "+a1+", r = "+r+" oraz an = "+an;
        }

    }
    public String geometricSeries() {
        int a;
        do{
            a  = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
        }while(a==0);
        int q;
        do{
            q  = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
        }while(q==0);
            int whichToLookFor = ThreadLocalRandom.current().nextInt(2, 7 + 1);
            int whichGiven;
            do {
                whichGiven = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            } while (whichGiven == whichToLookFor);
            return "Wyznacz " + whichToLookFor + ". wyraz ciągu geometrycznego, wiedząc, że a" + whichGiven + " = " + a + ", a q = " + q + ".";
    }
}
