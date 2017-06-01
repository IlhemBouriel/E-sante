package med.app.Repository;

import java.util.List;

import med.app.Model.Docteurs;

public interface DocteurDAO {
	public List<Docteurs> getAllDocs();
	public List<String> getAllSpec();
	public Docteurs findDocId(int id);
}
