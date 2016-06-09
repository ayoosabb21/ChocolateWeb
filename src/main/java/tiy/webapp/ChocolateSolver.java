package tiy.webapp;

/**
 * Created by willi on 6/3/2016.
 */
public class ChocolateSolver {

    public ChocolateFactory makeChocolate(int smalls, int bigs, int goal) {

        ChocolateFactory solution = new ChocolateFactory(smalls, bigs);
        int maxGoal = smalls + (bigs * 5);

        if (goal > maxGoal) {
            System.out.println("Not enough chocolate");
            solution.setNoSolution();
            return solution;
        }

        int smallsRequired = 0;
        int bigsRequired = 0;

        if (bigs == 0) {
            smallsRequired = goal;
        } else {
            smallsRequired = goal % 5;
            bigsRequired = goal / 5;
        }

        if (smallsRequired > smalls) {
            System.out.println("Not enough smalls");
            solution.setNoSolution();
            return solution;
        }

        if (bigsRequired > bigs) {
            smallsRequired += 5 * (bigsRequired - bigs);
            bigsRequired = bigs;
            if (smallsRequired > smalls) {
                System.out.println("Not enough bigs");
                solution.setNoSolution();
                return solution;
            }
        }

        solution.setSolution(smallsRequired, bigsRequired);

        return solution;
    }
}
