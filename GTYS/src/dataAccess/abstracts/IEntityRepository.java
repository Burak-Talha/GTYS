package dataAccess.abstracts;

import Entities.abstracts.IEntity;

public interface IEntityRepository <T extends IEntity> {
	public void Create(T entity);
	public void Read(T entity);
	public void Update(T entity);
	public void Delete(T entity);
	public void readEmail(T entity);
}
