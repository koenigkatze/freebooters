package org.koenigkatze.freebooters.card;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.koenigkatze.freebooters.card.attribute.AttributeSetBuilder;
import org.koenigkatze.freebooters.card.attribute.IAttributeSet;
import org.koenigkatze.freebooters.card.healthbar.HealthBarFactory;
import org.koenigkatze.freebooters.card.healthbar.IHealthBar;
import org.koenigkatze.freebooters.card.remark.IRemark;
import org.koenigkatze.freebooters.card.remark.Remark;

public class CardBuilderUnknownCreationTest
{
	
	private static ICard s_subjectUnderTest;
	
	@Before
	public void executedBeforeEachClass() {
		s_subjectUnderTest = Card.builder().build();
	}

	@Test
	public void testThatNoTitleWillResultInUnknownTitle()
	{
		Assert.assertEquals(s_subjectUnderTest.getTitle(), CardConst.UNKNOWN_TITLE);
	}
	
	@Test
	public void testThatNoRoleWillResultInUnknownRole() {
		Assert.assertEquals(s_subjectUnderTest.getRole(), CardConst.UNKNOWN_ROLE);
	}
	
	@Test
	public void testThatNoFractionWillResultInUnknownFraction() {
		Assert.assertEquals(s_subjectUnderTest.getFraction(), CardConst.UNKNOWN_FRACTION);
	}
	
	@Test
	public void testThatNoAttributesWillResultInUnknownAttributes() {
		final IAttributeSet attributeSet = AttributeSetBuilder.getInstance().build();
		Assert.assertEquals(s_subjectUnderTest.getAttributeSet(), attributeSet);
	}
	
	@Test
	public void testThatNoHealthBarWillResultInUnknownHealthBar() {
		final IHealthBar healthBar = HealthBarFactory.createUnknownHealthBar();
		Assert.assertEquals(s_subjectUnderTest.getHeathBar(), healthBar);
	}
	
	@Test
	public void testThatNoRemarkWillResultInUnknownRemark() {
		final IRemark remark = Remark.createUnknownRemark();
		Assert.assertEquals(s_subjectUnderTest.getRemark(), remark);
	}
	

}
