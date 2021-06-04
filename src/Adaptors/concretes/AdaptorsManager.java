package Adaptors.concretes;

import java.rmi.RemoteException;

import Adaptors.abstracts.BaseAdaptors;
import Entities.abstracts.PersonEntity;

public class AdaptorsManager {
	private BaseAdaptors baseAdaptors;
	private PersonEntity entities; 
public AdaptorsManager(BaseAdaptors baseAdaptors,PersonEntity entities) {
	this.baseAdaptors = baseAdaptors;
	this.entities = entities;
}

public boolean MERNÝS_Service_Adaptor() throws NumberFormatException, RemoteException {
boolean isTrue = baseAdaptors.checkIfRealPerson(entities);
	return isTrue;
}
public boolean REGEX_Service_Adaptor() throws NumberFormatException, RemoteException {
	boolean isTrue = baseAdaptors.checkEmail(entities);
	return isTrue;
}
}
