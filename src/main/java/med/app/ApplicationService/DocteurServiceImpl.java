package med.app.ApplicationService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import med.app.Model.Docteurs;
import med.app.Repository.DocteurDAO;
@Service
public class DocteurServiceImpl implements DocteurService {
	
	private DocteurDAO docteurDAO;

    
	public DocteurDAO getDocteurDAO() {
		return docteurDAO;
	}


	public void setDocteurDAO(DocteurDAO docteurDAO) {
		this.docteurDAO = docteurDAO;
	}

	@Transactional
	public List<Docteurs> listDocs()
	{	
		return docteurDAO.getAllDocs();
		
	}
	
	@Transactional
	public List<String> allSpec()
	{
		return docteurDAO.getAllSpec();
	}
	
	@Transactional
	public Docteurs findById(int id)
	{
		return docteurDAO.findDocId(id);
	}
}
