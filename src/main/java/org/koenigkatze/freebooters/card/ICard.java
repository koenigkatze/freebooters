package org.koenigkatze.freebooters.card;

import org.koenigkatze.freebooters.card.attribute.IAttributeSet;
import org.koenigkatze.freebooters.card.fraction.EFractionType;
import org.koenigkatze.freebooters.card.healthbar.IHealthBar;
import org.koenigkatze.freebooters.card.remark.IRemark;
import org.koenigkatze.freebooters.card.role.ERoleType;

public interface ICard
{

	String getTitle();

	ERoleType getRole();

	EFractionType getFraction();

	IAttributeSet getAttributeSet();

	IHealthBar getHeathBar();

	IRemark getRemark();

}