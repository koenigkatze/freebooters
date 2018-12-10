package org.koenigkatze.freebooters.repository;

import java.util.Optional;

import org.koenigkatze.freebooters.card.ICard;

public interface ICardRepository extends Iterable<ICard>
{

	void add(ICard card);

	Optional<ICard> getById(long id);

	int getCursor();
	
	ICard next();
	
	ICard previous();
}