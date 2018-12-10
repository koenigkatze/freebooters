package org.koenigkatze.freebooters.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.koenigkatze.freebooters.card.ICard;

public final class UniqueIdCardRepository implements ICardRepository
{
	private final List<ICard> m_repository;

	public UniqueIdCardRepository()
	{
		super();
		this.m_repository = new ArrayList<>();
		Collections.sort(m_repository);
	}
	
	@Override
	public void add(final ICard cardToAdd) {
		for (final ICard cardInRepository : m_repository) {
			if (cardInRepository.equals(cardToAdd)) {
				throw new IllegalArgumentException("A card with the same id is already registered in the repository! Id: "+cardToAdd.getId()); 
			}
		}
		this.m_repository.add(cardToAdd);
	}
	
	@Override
	public Optional<ICard> getById(final long idToFind) {
		for (final ICard cardInRepository : m_repository) {
			if (cardInRepository.getId() == idToFind) {
				return Optional.ofNullable(cardInRepository);
			}
		}
		return Optional.empty();
	}
	
}
