package Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.core.commands;

import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.Repository;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.Unit;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.UnitFactory;

public class AddCommand extends  Command{
    public AddCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = this.getUnitFactory().createUnit(unitType);
        getRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}
