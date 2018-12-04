package org.koenigkatze.freebooters.card;

import org.koenigkatze.freebooters.card.attribute.IAttributeSet;
import org.koenigkatze.freebooters.card.fraction.EFractionType;
import org.koenigkatze.freebooters.card.healthbar.IHealthBar;
import org.koenigkatze.freebooters.card.remark.IRemark;
import org.koenigkatze.freebooters.card.role.ERoleType;

final class Card implements ICard
{
	
	private final String m_title;
	private final ERoleType m_role;
	private final EFractionType m_fraction;
	private final IAttributeSet m_attributeSet;
	private final IHealthBar m_heathBar;
	private final IRemark m_remark;
	
	Card(
			final String m_title, 
			final ERoleType m_role, 
			final EFractionType m_fraction, 
			final IAttributeSet m_attributeSet,
			final IHealthBar m_heathBar, 
			final IRemark m_remark)
	{
		super();
		this.m_title = m_title;
		this.m_role = m_role;
		this.m_fraction = m_fraction;
		this.m_attributeSet = m_attributeSet;
		this.m_heathBar = m_heathBar;
		this.m_remark = m_remark;
	}
	
	public static CardBuilder builder() {
		return new CardBuilder();
	}
	
	@Override
	public String getTitle()
	{
		return m_title;
	}

	@Override
	public ERoleType getRole()
	{
		return m_role;
	}

	@Override
	public EFractionType getFraction()
	{
		return m_fraction;
	}

	@Override
	public IAttributeSet getAttributeSet()
	{
		return m_attributeSet;
	}

	@Override
	public IHealthBar getHeathBar()
	{
		return m_heathBar;
	}

	@Override
	public IRemark getRemark()
	{
		return m_remark;
	}
	
}
