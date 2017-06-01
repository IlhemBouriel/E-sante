package med.app.Model;
// Generated 22 mars 2017 01:15:28 by Hibernate Tools 5.2.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Medicament generated by hbm2java
 */
@Entity
@Table(name = "medicament", catalog = "e_med")
public class Medicament implements java.io.Serializable {

	private Integer idMed;
	private Docteurs docteurs;
	private Patients patients;
	private String intituleMed;
	private String descMed;

	public Medicament() {
	}

	public Medicament(Docteurs docteurs, Patients patients, String intituleMed, String descMed) {
		this.docteurs = docteurs;
		this.patients = patients;
		this.intituleMed = intituleMed;
		this.descMed = descMed;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_med", unique = true, nullable = false)
	public Integer getIdMed() {
		return this.idMed;
	}

	public void setIdMed(Integer idMed) {
		this.idMed = idMed;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_doc_med", nullable = false)
	public Docteurs getDocteurs() {
		return this.docteurs;
	}

	public void setDocteurs(Docteurs docteurs) {
		this.docteurs = docteurs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pat_med", nullable = false)
	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	@Column(name = "intitule_med", nullable = false, length = 30)
	public String getIntituleMed() {
		return this.intituleMed;
	}

	public void setIntituleMed(String intituleMed) {
		this.intituleMed = intituleMed;
	}

	@Column(name = "desc_med", nullable = false, length = 100)
	public String getDescMed() {
		return this.descMed;
	}

	public void setDescMed(String descMed) {
		this.descMed = descMed;
	}

}