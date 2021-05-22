package dataAccess.concretes;

import Entities.abstracts.IEntity;
import dataAccess.abstracts.IEntityRepository;

public class CustomerManager {
private IEntityRepository customerDal;

public CustomerManager(IEntityRepository customerDal) {
	this.customerDal = customerDal;
}



public void Create() {
	customerDal.Create();
}

public void Read() {
	customerDal.Read();
}

public void Update() {
	customerDal.Update();
}

public void Delete() {
	customerDal.Delete();
}

public void readEmail() {
	customerDal.readEmail();
}
	
}
