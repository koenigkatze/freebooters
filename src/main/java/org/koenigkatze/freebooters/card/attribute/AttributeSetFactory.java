package org.koenigkatze.freebooters.card.attribute;

public final class AttributeSetFactory
{

	public static IAttributeSet createUnknownAttributeSet()
	{
		return AttributeSet.builder().build();
	}

}
