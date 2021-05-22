package dataAccess.concretes;

import Entities.concretes.Student;
import dataAccess.abstracts.IEntityRepository;
import java.util.Scanner;
public class StudentManager implements IEntityRepository<Student> {
	Scanner scan = new Scanner(System.in);
	@Override
	public void Create(Student entity) {
		System.out.println("Ýsminizi giriniz :");
		String name = scan.nextLine();
		entity.setFirstName(name);
		
	}


	public void Read(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readEmail(Student entity) {
		// TODO Auto-generated method stub
		
	}



}
