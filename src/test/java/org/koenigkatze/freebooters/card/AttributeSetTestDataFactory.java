package org.koenigkatze.freebooters.card;

import org.koenigkatze.freebooters.card.attribute.AttributeSetBuilder;
import org.koenigkatze.freebooters.card.attribute.IAttributeSet;

public final class AttributeSetTestDataFactory
{

	public static IAttributeSet createUnknownAttributeSet()
	{
		return AttributeSetBuilder.getInstance().build();
	}

}
