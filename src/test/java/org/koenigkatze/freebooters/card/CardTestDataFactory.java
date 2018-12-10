package org.koenigkatze.freebooters.card;

import org.koenigkatze.freebooters.card.remark.Remark;

public class CardTestDataFactory
{
	

	public static ICard createUnknownCardWithCertainId(final long idToSet)
	{
		return CardBuilder.getInstance()
				.withId(idToSet)
				.withTitle(CardConst.UNKNOWN_TITLE)
				.withFraction(CardConst.UNKNOWN_FRACTION)
				.withRole(CardConst.UNKNOWN_ROLE)
				.withAttributes(AttributeSetTestDataFactory.createUnknownAttributeSet())
				.withHealthBar(HealthBarTestDataFactory.createUnknownHealthBar())
				.withRemark(Remark.createUnknownRemark())
				.build();
	}

}
