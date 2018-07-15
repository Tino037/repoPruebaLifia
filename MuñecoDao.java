package daos;

import model.Muñeco;


public interface MuñecoDao extends GenericDao<Muñeco> {

	public Long createMuñeco(Muñeco p);
	

}