package daos;
	import javax.transaction.Transactional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

import model.Muñeco;

	@Repository
	public class MuñecoDaoHibernate  extends GenericDaoHibernate<Muñeco> implements MuñecoDao {
		@Autowired
		private HibernateUtil util;
		
		public MuñecoDaoHibernate() {
			// TODO Auto-generated constructor stub
			super(Muñeco.class);//usa el constructor del dao generico public GenericDaoHibernate(Class<T> entidad)
		}
		
		@Override
		@Transactional
		 public void update(Muñeco p) {
			util.update(p);
		}
		
		public Long createMuñeco(Muñeco p) {
			this.save(p);
			Long aux=(long) 8909;
			return aux;
		}
		public Muñeco mergePlate(Muñeco p) {
			return p;
		}
	}