package dataAccess.concretes;


import Entities.abstracts.IEntity;

import dataAccess.abstracts.IEntityRepository;



public class BossManager implements IEntityRepository{

	@Override
	public void Create(IEntity entity) {
		System.out.println("Müdür baþarýyla eklendi");
		
	}

	@Override
	public void Read(IEntity entity) {
		System.out.println("Müdür bilgileri yazdýrýlýyor...");
		
	}

	@Override
	public void Update(IEntity entity) {
		System.out.println("Okul bilgileri güncellendi");
		
	}

	@Override
	public void Delete(IEntity entity) {
		System.out.println("Okul bilgisi veri tabanýndan silindi");
		
	}

	@Override
	public void readEmail(IEntity entity) {
		System.out.println("E mail okunuyor");
		
	}






}
