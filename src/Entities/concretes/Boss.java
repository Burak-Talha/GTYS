package Entities.concretes;

import Entities.abstracts.IEntity;
import Entities.abstracts.PersonEntity;

public class Boss implements IEntity,PersonEntity {
	private int LevelId;
	private int schoolId;
	private String nationalId;
	private String firstName;
	private String lastName;
	private String Email;
	private String password;
	private int birthYear;
	
	
	public int getLevelId() {
		return LevelId;
	}
	public void setLevelId(int levelId) {
		LevelId = levelId;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public int getbirthYear() {
		return birthYear;
	}
	public void setbirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	
}
