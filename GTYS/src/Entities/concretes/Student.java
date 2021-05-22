package Entities.concretes;

import Entities.abstracts.IEntity;

public class Student implements IEntity {
private int schoolId;
private String firstName;
private String lastName;
private int classNo;
private String nationalId;
private String Email;
private String password;



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
public int getClassNo() {
	return classNo;
}
public void setClassNo(int classNo) {
	this.classNo = classNo;
}
public String getNationalId() {
	return nationalId;
}
public void setNationalId(String nationalId) {
	this.nationalId = nationalId;
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
