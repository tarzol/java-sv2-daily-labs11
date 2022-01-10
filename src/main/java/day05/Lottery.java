package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int range;
    private int numberOfDraws;
    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> startLottery(int range, int numberOfDraws) {

        Random rnd = new Random();
        /*while (numbers.size() < numberOfDraws ) {

        }*/
        for ( int i = 0; i < numberOfDraws; ) {
            int nextDraw = rnd.nextInt(90) +1;
            if ( !numbers.contains(nextDraw)) {
                numbers.add(nextDraw);
                i++;
            }
        }
        return numbers;
    }

    public int getRange() {
        return range;
    }

    public int getNumberOfDraws() {
        return numberOfDraws;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        lottery.startLottery(90, 5);
    }
}
