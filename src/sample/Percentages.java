package sample;

import java.util.concurrent.ThreadLocalRandom;

public class Percentages {
    public String percentages(){
        int typeOfExercise = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        if(typeOfExercise == 1)
            return bank();
        else if(typeOfExercise == 2)
            return number_from_procentage();
        else
            return procentage_from_number();
    }
    public String bank(){
        String start;
        String task;
        int amount = ThreadLocalRandom.current().nextInt(10, 100 + 1)*100;
        int time = ThreadLocalRandom.current().nextInt(1, 4 + 1)*3;
        int percentage = ThreadLocalRandom.current().nextInt(2, 8 + 1);
        String[] who_male = {"Adam", "Krzysztof", "Jan", "Maciej", "Bartosz", "Piotrek", "Stanisław"};
        String[] who_female = {"Anna", "Janina", "Izabela", "Katarzyna", "Małgorzata", "Maria", "Jadwiga"};
        int taskNumber = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        if(taskNumber == 1){
            task = "Ile pieniędzy znajdować się będzie na koncie po zakończeniu lokaty? Uwzględnij podatek od dochodu lokaty w wysokości 20%.";
        } else {
            task = "Ile pieniędzy więcej będzie na koncie po zakończeniu lokaty? Uwzględnij podatek od dochodu lokaty w wysokości 20%.";
        }
        int who = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        if(who == 1){
            start = "Pan "+ who_male[ThreadLocalRandom.current().nextInt(0, 6 + 1)] + " wpłacił";
        } else {
            start = "Pani "+ who_female[ThreadLocalRandom.current().nextInt(0, 6 + 1)] + " wpłaciła";
        }
        return start + " " + amount + "zł do banku na lokatę o oprocentowaniu " + percentage + "% w skali roku na " + time + " miesięcy. "+task;
    }
    public String number_from_procentage(){
        int percentage = ThreadLocalRandom.current().nextInt(1, 20 + 1)*5;
        int number = ThreadLocalRandom.current().nextInt(1, 20 + 1)*5;
        return "Wyznacz liczbę, której "+percentage+"% wynosi "+number+".";
    }
    public String procentage_from_number(){
        int percentage = ThreadLocalRandom.current().nextInt(1, 20 + 1)*5;
        int number = ThreadLocalRandom.current().nextInt(2, 40 + 1)*50;
        return "Ile wynosi " + percentage + "% liczby " + number + "?";
    }
}
