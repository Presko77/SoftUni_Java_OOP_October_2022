package Reflection_Exercises.P03BarracksWars.core.factories;

import Reflection_Exercises.P03BarracksWars.interfaces.Unit;
import Reflection_Exercises.P03BarracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"Reflection_Exercises.barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType){
		try {
			Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<Unit> constructor = unitClass.getDeclaredConstructor();
			return constructor.newInstance();
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}