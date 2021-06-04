package dataAccess.concretes;


import Entities.abstracts.IEntity;

import dataAccess.abstracts.IEntityRepository;



public class BossManager implements IEntityRepository{

	@Override
	public void Create(IEntity entity) {
		System.out.println("M�d�r ba�ar�yla eklendi");
		
	}

	@Override
	public void Read(IEntity entity) {
		System.out.println("M�d�r bilgileri yazd�r�l�yor...");
		
	}

	@Override
	public void Update(IEntity entity) {
		System.out.println("Okul bilgileri g�ncellendi");
		
	}

	@Override
	public void Delete(IEntity entity) {
		System.out.println("Okul bilgisi veri taban�ndan silindi");
		
	}

	@Override
	public void readEmail(IEntity entity) {
		System.out.println("E mail okunuyor");
		
	}






}
