package Entities.concretes;

import Entities.abstracts.IEntity;

public class School implements IEntity {
	private int schoolId;
	private String schoolName;
	private int educationTime;
	private double OBP;
	private double LGS_point;
	private double percentile;
	private String foreignLanguage;


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
	public double getOBP() {
		return OBP;
	}
	public void setOBP(double oBP) {
		OBP = oBP;
	}
	public double getLGS_point() {
		return LGS_point;
	}
	public void setLGS_point(double lGS_point) {
		LGS_point = lGS_point;
	}
	public double getPercentile() {
		return percentile;
	}
	public void setPercentile(double percentile) {
		this.percentile = percentile;
	}
	public String getForeignLanguage() {
		return foreignLanguage;
	}
	public void setForeignLanguage(String foreignLanguage) {
		this.foreignLanguage = foreignLanguage;
	}

}
