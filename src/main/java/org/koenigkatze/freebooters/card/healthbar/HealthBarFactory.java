package org.koenigkatze.freebooters.card.healthbar;

public final class HealthBarFactory
{

	public static IHealthBar createUnknownHealthBar()
	{
		return HealthBar.builder().build();
	}

}
