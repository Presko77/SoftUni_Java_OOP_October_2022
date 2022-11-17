package Reflection_Exercises.P03BarracksWars;

import Reflection_Exercises.P03BarracksWars.interfaces.Repository;
import Reflection_Exercises.P03BarracksWars.interfaces.Runnable;
import Reflection_Exercises.P03BarracksWars.interfaces.UnitFactory;
import Reflection_Exercises.P03BarracksWars.core.Engine;
import Reflection_Exercises.P03BarracksWars.core.factories.UnitFactoryImpl;
import Reflection_Exercises.P03BarracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
