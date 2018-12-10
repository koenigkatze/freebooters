package org.koenigkatze.freebooters.testdata;

import org.koenigkatze.freebooters.card.attribute.AttributeSetBuilder;
import org.koenigkatze.freebooters.card.attribute.IAttributeSet;

public final class AttributeSetTestDataFactory
{

	public static IAttributeSet createUnknownAttributeSet()
	{
		return AttributeSetBuilder.getInstance().build();
	}

}
