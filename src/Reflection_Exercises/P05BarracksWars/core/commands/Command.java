package Reflection_Exercises.P05BarracksWars.core.commands;

import Reflection_Exercises.P05BarracksWars.interfaces.Executable;
import Reflection_Exercises.P05BarracksWars.interfaces.Repository;
import Reflection_Exercises.P05BarracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {

    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    public Command(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return data;
    }

    public Repository getRepository() {
        return repository;
    }

    public UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
