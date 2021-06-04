package Validator.concretes;

import Entities.abstracts.IEntity;
import Validator.abstracts.BaseValidator;

public class ValidatorManager {
private BaseValidator baseValidator;
private IEntity entities;

public ValidatorManager(BaseValidator baseValidator,IEntity entities) {
	this.baseValidator = baseValidator;
	this.entities = entities;
}
public void validCreate() {
	baseValidator.validCreate(entities);
}
public void validUpdate() {
	baseValidator.validUpdate(entities);
}
public void validDelete() {
	baseValidator.validDelete(entities);
}
}
