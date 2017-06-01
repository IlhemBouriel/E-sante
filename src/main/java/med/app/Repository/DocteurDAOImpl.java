package med.app.Repository;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import med.app.Model.Docteurs;

@Repository
public class DocteurDAOImpl implements DocteurDAO {
	private static final Logger logger = LoggerFactory.getLogger(DocteurDAOImpl.class);
	
	@Autowired(required = false)
	@Qualifier("sessionFactoryDoc")
	private SessionFactory sessionFactoryDoc;
	
	

	public SessionFactory getSessionFactoryDoc() {
		return sessionFactoryDoc;
	}

	public void setSessionFactoryDoc(SessionFactory sessionFactoryDoc) {
		this.sessionFactoryDoc = sessionFactoryDoc;
	}

	@SuppressWarnings("unchecked")
	public List<Docteurs> getAllDocs()
	{
		Session session = this.sessionFactoryDoc.getCurrentSession();
		List<Docteurs> docteursList = session.createQuery("from Docteurs").list();
		/*for(Docteurs d : docteursList){
			System.out.println("doct ===> "+d.getNomDoc());
		}*/
		return docteursList;
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getAllSpec()
	{
		Session session = this.sessionFactoryDoc.getCurrentSession();
		String hql = "SELECT distinct E.specialiteDoc FROM Docteurs E";
		Query query = session.createQuery(hql);
		List results = query.list();
	     return results;
	     
	}
	
	@SuppressWarnings("unchecked")
	public Docteurs findDocId(int id)
	{
		Session session = this.sessionFactoryDoc.getCurrentSession();
		Docteurs d = (Docteurs) session.load(Docteurs.class, id);
		return d;
	}
	
	
}
