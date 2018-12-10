package org.koenigkatze.freebooters.repository;

public interface ICardRepositoryFactory
{
	public static ICardRepository createUniqueIdCardRepository()
	{
		return new UniqueIdCardRepository();
	}
}
