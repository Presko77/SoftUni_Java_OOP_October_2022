package Reflection_Exercises.P05BarracksWars.core.commands;

public class FightCommand extends Command{

    public FightCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
