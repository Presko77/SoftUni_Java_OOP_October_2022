package Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.core.commands;

import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.Repository;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.UnitFactory;

public class RetireCommand extends Command{
    public RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        try {
            String unitType = getData()[1];
            getRepository().removeUnit(unitType);
            return String.format("%s retired!", unitType);
        }catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }
}
