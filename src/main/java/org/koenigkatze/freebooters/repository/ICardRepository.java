package org.koenigkatze.freebooters.repository;

import java.util.Optional;

import org.koenigkatze.freebooters.card.ICard;

public interface ICardRepository
{

	void add(ICard card);

	Optional<ICard> getById(long id);

}