package Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.core.commands;

import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.Repository;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.UnitFactory;

public class ReportCommand extends Command{
    public ReportCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return this.getRepository().getStatistics();
    }
}
