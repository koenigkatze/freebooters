package org.koenigkatze.freebooters.testdata;

import org.koenigkatze.freebooters.card.healthbar.HealthBarBuilder;
import org.koenigkatze.freebooters.card.healthbar.IHealthBar;

public final class HealthBarTestDataFactory
{

	public static IHealthBar createUnknownHealthBar()
	{
		return HealthBarBuilder.getInstance().build();
	}

}
