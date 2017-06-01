package med.app.ApplicationService;

import java.util.List;

import med.app.Model.Docteurs;


public interface DocteurService {
	public List<Docteurs> listDocs();
	public List<String> allSpec();
	public Docteurs findById(int id);
}
