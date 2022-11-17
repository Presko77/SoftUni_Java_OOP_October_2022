package Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.core.commands;

import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.CommandInterpreter;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.Executable;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.Repository;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.UnitFactory;

public class CommandInterpreterImpl implements CommandInterpreter {

    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        switch (commandName) {
            case "add":
                return new AddCommand(data ,repository, unitFactory);
            case "report":
                return new ReportCommand(data, repository, unitFactory);
            case "fight":
                return new FightCommand(data, repository, unitFactory);
            case "retire":
                return new RetireCommand(data ,repository, unitFactory);
            default:
                throw new RuntimeException("Invalid command!");
        }
    }
}
