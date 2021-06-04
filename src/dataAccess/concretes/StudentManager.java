package dataAccess.concretes;

import Entities.abstracts.IEntity;

import dataAccess.abstracts.IEntityRepository;


public class StudentManager implements IEntityRepository {
	 

	@Override
	public void Create(IEntity entity) {
		System.out.println("Öðrenci baþarýyla eklendi");
		
	}

	@Override
	public void Read(IEntity entity) {
		System.out.println("Öðrenci bilgileri yazdýrýlýyor...");
	}

	@Override
	public void Update(IEntity entity) {
		System.out.println("Öðrenci bilgileri güncellendi");
		
	}

	@Override
	public void Delete(IEntity entity) {
		System.out.println("Öðrenci bilgisi veri tabanýndan silindi");
		
	}

	@Override
	public void readEmail(IEntity entity) {
		System.out.println("E mail okunuyor");
		
	}
	public void something() {
		
	}
	




}
