package models;

/**
 * Created by steve on 2016-11-07.
 */
public class Dice {
    private Die redDie = new Die(), blueDie = new Die();

    public int roll() {
        int roll = redDie.roll() + blueDie.roll();
        if (roll == 7) {
            return roll();
        }
        return roll;
    }
}
