package challenge04;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CrapsGame {
    public static void play() {
        int round = 0;
        int yourPoint = 0;
        List<Integer> natural = Arrays.asList(7, 11); //NATURAL Values on First Round - WIN
        List<Integer> craps = Arrays.asList(2, 3, 12); //CRAPS Values on First Round - LOSE
        List<Integer> point = Arrays.asList(4, 5, 6, 8, 9, 10); //Point Values on another rounds

        do {
            round++;
            int dice1 = diceValue();
            int dice2 = diceValue();
            int diceSum = dice1 + dice2;

            if(round == 1) {
                if(natural.contains(diceSum)) {
                    System.out.printf("Round = %d\n\n You take %d on round %d\n You are NATURAL!\n",
                            round, diceSum, round);
                    System.out.println("WINNER");
                    break;
                }
                else if(craps.contains(diceSum)) {
                    System.out.printf("Round = %d\n\n You take %d on round %d = CRAPS\n",
                            round, diceSum, round);
                    System.out.println("LOSER");
                    break;
                }
                else {
                    yourPoint = diceSum;
                }
            }
            else {
                if(diceSum == yourPoint) {
                    System.out.printf("Round = %d\n\n Your point is equal dice sum %d\n",
                            round, yourPoint, diceSum);
                    System.out.println("WINNER");
                    break;
                }
                else if(diceSum == 7) {
                    System.out.printf("Round = %d\n\n You take %d on round %d\n",
                            round, diceSum, round);
                    System.out.println("LOSER");
                    break;
                }
                else {
                    continue;
                }
            }
        } while(true);
    }

    private static int diceValue() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
