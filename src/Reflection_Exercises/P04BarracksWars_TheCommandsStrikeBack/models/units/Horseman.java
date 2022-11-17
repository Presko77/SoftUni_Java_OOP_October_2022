package Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.models.units;

public class Horseman extends AbstractUnit{

    public static final int HORSEMAN_HEALTH = 50;
    public static final int HORSEMAN_DAMAGE = 10;

    public Horseman() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
