package dataAccess.abstracts;

import Entities.abstracts.IEntity;

public interface IEntityRepository {
	public void Create(IEntity entity);
	public void Read(IEntity entity);
	public void Update(IEntity entity);
	public void Delete(IEntity entity);
	public void readEmail(IEntity entity);
}
