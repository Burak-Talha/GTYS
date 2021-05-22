package Validator.abstracts;

import Entities.abstracts.IEntity;

public interface IBaseValidator<T extends IEntity> {
public void Create(T entity);
public void Update(T entity);
public void Delete(T entity);
}
