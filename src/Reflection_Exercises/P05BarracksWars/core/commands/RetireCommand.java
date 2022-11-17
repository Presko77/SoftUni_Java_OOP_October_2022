package Reflection_Exercises.P05BarracksWars.core.commands;

import Reflection_Exercises.P05BarracksWars.annotations.Inject;
import Reflection_Exercises.P05BarracksWars.interfaces.Repository;

public class RetireCommand extends Command{
    @Inject
    private Repository repository;
    public RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        try {
            String unitType = getData()[1];
            repository.removeUnit(unitType);
            return String.format("%s retired!", unitType);
        }catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }
}
