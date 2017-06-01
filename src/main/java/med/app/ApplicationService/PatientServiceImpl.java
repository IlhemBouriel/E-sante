package med.app.ApplicationService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import med.app.Model.Patients;
import med.app.Repository.PatientDAO;

@Service
public class PatientServiceImpl implements PatientService{
	private PatientDAO patientDAO;

	public PatientDAO getPatientDAO() {
		return patientDAO;
	}

	public void setPatientDAO(PatientDAO patientDAO) {
		this.patientDAO = patientDAO;
	}
	@Transactional
	public void ajouterPat(Patients p){
		patientDAO.addPat(p);
	}
}
