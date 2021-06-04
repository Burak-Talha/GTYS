package dataAccess.concretes;

import Entities.abstracts.IEntity;

import dataAccess.abstracts.IEntityRepository;


public class StudentManager implements IEntityRepository {
	 

	@Override
	public void Create(IEntity entity) {
		System.out.println("��renci ba�ar�yla eklendi");
		
	}

	@Override
	public void Read(IEntity entity) {
		System.out.println("��renci bilgileri yazd�r�l�yor...");
	}

	@Override
	public void Update(IEntity entity) {
		System.out.println("��renci bilgileri g�ncellendi");
		
	}

	@Override
	public void Delete(IEntity entity) {
		System.out.println("��renci bilgisi veri taban�ndan silindi");
		
	}

	@Override
	public void readEmail(IEntity entity) {
		System.out.println("E mail okunuyor");
		
	}
	public void something() {
		
	}
	




}
