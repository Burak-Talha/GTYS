package Entities.concretes;

import Entities.abstracts.IEntity;

public class HighSchool extends School implements IEntity {
private double OBP;
private double lgsScore;
private double percentile;


public double getOBP() {
	return OBP;
}
public void setOBP(double oBP) {
	OBP = oBP;
}
public double getLgsScore() {
	return lgsScore;
}
public void setLgsScore(double lgsScore) {
	this.lgsScore = lgsScore;
}
public double getPercentile() {
	return percentile;
}
public void setPercentile(double percentile) {
	this.percentile = percentile;
}
}
