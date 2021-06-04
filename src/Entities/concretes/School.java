package Entities.concretes;




public class School  {
private int LevelId;
private int schoolId;
private String schoolName;
private int educationTime;
private int quota;
private String foreignLanguage;
private String province;
private String disctrict;
private String neighborhood;


public int getLevelId() {
	return LevelId;
}
public void setLevelId(int levelId) {
	LevelId = levelId;
}
public int getSchoolId() {
	return schoolId;
}
public void setSchoolId(int schoolId) {
	this.schoolId = schoolId;
}
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
public int getEducationTime() {
	return educationTime;
}
public void setEducationTime(int educationTime) {
	this.educationTime = educationTime;
}
public int getQuota() {
	return quota;
}
public void setQuota(int quota) {
	this.quota = quota;
}
public String getForeignLanguage() {
	return foreignLanguage;
}
public void setForeignLanguage(String foreignLanguage) {
	this.foreignLanguage = foreignLanguage;
}
public String getProvince() {
	return province;
}
public void setProvince(String province) {
	this.province = province;
}
public String getDisctrict() {
	return disctrict;
}
public void setDisctrict(String disctrict) {
	this.disctrict = disctrict;
}
public String getNeighborhood() {
	return neighborhood;
}
public void setNeighborhood(String neighborhood) {
	this.neighborhood = neighborhood;
}

}
