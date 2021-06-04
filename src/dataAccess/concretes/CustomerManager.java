package dataAccess.concretes;



import Entities.abstracts.IEntity;
import dataAccess.abstracts.IEntityRepository;

public class CustomerManager {
private IEntityRepository entityManager;
private IEntity entities;

public CustomerManager(IEntityRepository entityManager,IEntity entities) {
this.entityManager = entityManager;
this.entities = entities;
}



public void Create() {
	entityManager.Create(entities);
}

public void Read() {
	entityManager.Read(entities);
}

public void Update() {
	entityManager.Update(entities);
}

public void Delete() {
	entityManager.Delete(entities);
}

public void readEmail() {
	entityManager.readEmail(entities);
}
	
}
