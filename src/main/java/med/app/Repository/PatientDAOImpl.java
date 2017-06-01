package med.app.Repository;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import med.app.Model.Patients;

@Repository
public class PatientDAOImpl implements PatientDAO{
	@Autowired(required = false)
	@Qualifier("sessionFactoryPat")
	private SessionFactory sessionFactoryPat;
	
	public SessionFactory getSessionFactoryPat() {
		return sessionFactoryPat;
	}


	public void setSessionFactoryPat(SessionFactory sessionFactoryPat) {
		this.sessionFactoryPat = sessionFactoryPat;
	}
	@SuppressWarnings("unchecked")
	public void addPat(Patients p){
		Session session = this.sessionFactoryPat.getCurrentSession();
		try {
		    session.persist(p);
		}
		catch (RuntimeException e) {
		    throw e; // or display error message
		}
		
		

	}

}
