package Validator.concretes;

import Validator.abstracts.IBaseValidator;

public class ValidatorManager {
private IBaseValidator baseValidator;

public ValidatorManager(IBaseValidator baseValidator) {
	this.baseValidator = baseValidator;
}
public void Create() {
	baseValidator.Create();
}
public void Update() {
	baseValidator.Update();
}
public void Delete() {
	baseValidator.Delete();
}
}
