package Reflection_Exercises.P05BarracksWars.core.commands;

import Reflection_Exercises.P05BarracksWars.annotations.Inject;
import Reflection_Exercises.P05BarracksWars.interfaces.Repository;

public class ReportCommand extends Command{

    @Inject
    private Repository repository;

    public ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return repository.getStatistics();
    }
}
