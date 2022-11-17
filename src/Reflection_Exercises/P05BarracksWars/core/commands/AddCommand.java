package Reflection_Exercises.P05BarracksWars.core.commands;

import Reflection_Exercises.P05BarracksWars.annotations.Inject;
import Reflection_Exercises.P05BarracksWars.interfaces.Repository;
import Reflection_Exercises.P05BarracksWars.interfaces.Unit;
import Reflection_Exercises.P05BarracksWars.interfaces.UnitFactory;

public class AddCommand extends  Command{
    @Inject
   private Repository repository;
    @Inject
    private UnitFactory unitFactory;
    public AddCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = unitFactory.createUnit(unitType);
        repository.addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}
