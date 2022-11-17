package Reflection_Exercises.P05BarracksWars;

import Reflection_Exercises.P05BarracksWars.core.commands.CommandInterpreterImpl;
import Reflection_Exercises.P05BarracksWars.interfaces.CommandInterpreter;
import Reflection_Exercises.P05BarracksWars.interfaces.Repository;
import Reflection_Exercises.P05BarracksWars.interfaces.Runnable;
import Reflection_Exercises.P05BarracksWars.interfaces.UnitFactory;
import Reflection_Exercises.P05BarracksWars.core.Engine;
import Reflection_Exercises.P05BarracksWars.core.factories.UnitFactoryImpl;
import Reflection_Exercises.P05BarracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        CommandInterpreter commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);
        Runnable engine = new Engine(commandInterpreter);
        engine.run();
    }
}
