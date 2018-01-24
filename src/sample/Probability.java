package sample;

import java.util.concurrent.ThreadLocalRandom;

public class Probability {

    public String calculus_of_probability(){
        int typeOfExercise = ThreadLocalRandom.current().nextInt(1, 5 + 1);
        if(typeOfExercise == 1)
            return balls();
        else if(typeOfExercise == 2)
            return pennies();
        else if(typeOfExercise == 3)
            return die();
        else if(typeOfExercise == 4)
            return classroom();
        else
            return numbers();
    }
    public String balls(){
        String part1;
        String part2;
        int a = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        if(a == 1)
            part1 = a+ " kula biała";
        else if(a>1 && a<5)
            part1 = a+ " kule białe";
        else
            part1 = a+ " kul białych";
        int b = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        if(b == 1)
            part2 = b+ " kula czarna";
        else if(b>1 && b<5)
            part2 = b+ " kule czarne";
        else
            part2 = b+ " kul czarnych";
        int taskNumber = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        String task;
        if(taskNumber == 1)
            task = "Jakie jest prawdopodobieństwo wyjęcia białej kuli?";
        else if (taskNumber == 2)
            task = "Jakie jest prawdopodobieństwo wyjęcia najpierw białej kuli, a następnie czarnej kuli?";
        else if(taskNumber == 3)
            task = "Jakie jest prawdopodobieństwo wyjęcia białej kuli 2 razy z rzędu, gdy kule odkładamy do worka?";
        else
            task = "Jakie jest prawdopodobieństwo wyjęcia wszystkich czarnych kul, nie wyjmując przy tym żadnej białej?";
        return "W nieprzeźroczystym worku znajdują się: "+part1+" oraz "+part2+". "+task;
    }
    public String pennies() {
        int taskNumber = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        String task;
        if (taskNumber == 1)
            task = "wypadnięcia reszki w obu rzutach.";
        else if (taskNumber == 2)
            task = "wypadnięcia orła w pierwszym rzucie.";
        else if (taskNumber == 3)
            task = "otrzymania w obu rzutach tego samego wyniku.";
        else
            task = "otrzymania najpierw orła, a następnie reszki.";
        return "Rzucamy dwukrotnie monetą. Oblicz prawdopodobieństwo " + task;
    }
    public String die(){
        int taskNumber = ThreadLocalRandom.current().nextInt(1, 8 + 1);
        String task;
        if (taskNumber == 1)
            task = "otrzymania parzystej liczby oczek w obu rzutach.";
        else if (taskNumber == 2)
            task = "otrzymania nieparzystej sumy oczek.";
        else if (taskNumber == 3)
            task = "otrzymania sumy oczek równej 7.";
        else if (taskNumber == 4)
            task = "otrzymania iloczynu oczek równego 6.";
        else if (taskNumber == 5)
            task = "otrzymania różnych liczb oczek na obu kostakch.";
        else if (taskNumber == 6)
            task = "otrzymania tej samej liczby oczek na obu kostkach.";
        else if (taskNumber == 7)
            task = "zdarzenia A polegającego na tym, że liczba oczek w drugim rzucie jest o 1 większa niż w pierwszym rzucie.";
        else
            task = "zdarzenia A polegającego na tym, że liczba oczek między rzutami różni się o 1.";
        return "Rzucamy dwa razy szcześcienną, symetryczną kostką do gry. Oblicz prawdopodobieństwo "+task;
    }
    public String classroom(){
        int a = ThreadLocalRandom.current().nextInt(10, 21 + 1);
        int b = ThreadLocalRandom.current().nextInt(10, 21 + 1);
        String classroom = "W klasie jest "+a+" chłopców oraz "+b+" dziewcząt.";
        int nop = ThreadLocalRandom.current().nextInt(2, 4 + 1);
        String people = "Wybrano losowo "+nop+" uczniów.";
        int taskNumber = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        String task;
        if (taskNumber == 1)
            task = "Jakie jest prawdopodobieństwa, że wybrano na początku i na końcu dziewczynkę?";
        else if (taskNumber == 2)
            task = "Oblicz prawdopodobieństwo wybrano samych chłopców.";
        else if (taskNumber == 3)
            task = "Oblicz prawodopodobieństwo wybrano osoby, która ćwiczy na siłowni, jeśli wiemy, że ćwiczy 5 chłopców i 3 dziewczynki.";
        else
            task = "Jakie jest prawdopodobieństwo, że wybrano jedną z harcerek, jeśli wiemy, że jest ich 5?";
        return classroom+" "+people+" "+task;
    }
    public String numbers(){
        int numbers = ThreadLocalRandom.current().nextInt(8, 21 + 1);
        String begin = "Ze zbioru {";
        for(int i=1; i<numbers;i++)
            begin+=i+",";
        begin = begin.substring(0, begin.length() - 1);
        begin+="} ";
        int taskNumber = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        String task;
        if (taskNumber == 1)
            task = "wybieramy losowo jedną liczbę. Jakie jest prawdopodobieństwo otrzymania liczby podzielnej przez 4?";
        else if (taskNumber == 2)
            task = "wybieramy losowo jedną liczbę. Jakie jest prawdopodobieństwo otrzymania liczby podzielnej przez 3 lub przez 2?";
        else if (taskNumber == 3)
            task = "wyjmujemy bez zwracania 3 liczby. Oblicz prawdopodobieństwo zdarzenia A polegającego na tym, że wyjęto tylko liczby większe niż 3.";
        else
            task = "wyjmujemy bez zwracania 2 liczby. Oblicz prawdopodobieństwo zdarzenia A polegającego na tym, że iloczyn wyjętych liczb jest podzielny przez 6.";
        return begin+task;
    }
}
