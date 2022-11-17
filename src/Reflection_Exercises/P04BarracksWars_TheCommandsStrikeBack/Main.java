package Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack;

import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.core.commands.CommandInterpreterImpl;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.CommandInterpreter;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.Repository;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.Runnable;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.interfaces.UnitFactory;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.core.Engine;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.core.factories.UnitFactoryImpl;
import Reflection_Exercises.P04BarracksWars_TheCommandsStrikeBack.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        CommandInterpreter commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);
        Runnable engine = new Engine(commandInterpreter);
        engine.run();
    }
}
