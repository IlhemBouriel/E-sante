package med.app.Model;
// Generated 22 mars 2017 01:15:28 by Hibernate Tools 5.2.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Docteurs generated by hbm2java
 */
@Entity
@Table(name = "docteurs", catalog = "e_med")
public class Docteurs implements java.io.Serializable {

	private Integer idDoc;
	private String nomDoc;
	private String prenomDoc;
	private String specialiteDoc;
	private Set<RendezVous> rendezVouses = new HashSet<RendezVous>(0);
	private Set<Medicament> medicaments = new HashSet<Medicament>(0);
	private Set<Endorse> endorses = new HashSet<Endorse>(0);
	private Set<Messages> messageses = new HashSet<Messages>(0);
	private Set<Patients> patientses = new HashSet<Patients>(0);
	private Set<Articles> articleses = new HashSet<Articles>(0);

	public Docteurs() {
	}

	public Docteurs(String nomDoc, String prenomDoc, String specialiteDoc) {
		this.nomDoc = nomDoc;
		this.prenomDoc = prenomDoc;
		this.specialiteDoc = specialiteDoc;
	}

	public Docteurs(String nomDoc, String prenomDoc, String specialiteDoc, Set<RendezVous> rendezVouses,
			Set<Medicament> medicaments, Set<Endorse> endorses, Set<Messages> messageses, Set<Patients> patientses,
			Set<Articles> articleses) {
		this.nomDoc = nomDoc;
		this.prenomDoc = prenomDoc;
		this.specialiteDoc = specialiteDoc;
		this.rendezVouses = rendezVouses;
		this.medicaments = medicaments;
		this.endorses = endorses;
		this.messageses = messageses;
		this.patientses = patientses;
		this.articleses = articleses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_doc", unique = true, nullable = false)
	public Integer getIdDoc() {
		return this.idDoc;
	}

	public void setIdDoc(Integer idDoc) {
		this.idDoc = idDoc;
	}

	@Column(name = "nom_doc", nullable = false, length = 30)
	public String getNomDoc() {
		return this.nomDoc;
	}

	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}

	@Column(name = "prenom_doc", nullable = false, length = 30)
	public String getPrenomDoc() {
		return this.prenomDoc;
	}

	public void setPrenomDoc(String prenomDoc) {
		this.prenomDoc = prenomDoc;
	}

	@Column(name = "specialite_doc", nullable = false, length = 22)
	public String getSpecialiteDoc() {
		return this.specialiteDoc;
	}

	public void setSpecialiteDoc(String specialiteDoc) {
		this.specialiteDoc = specialiteDoc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docteurs")
	public Set<RendezVous> getRendezVouses() {
		return this.rendezVouses;
	}

	public void setRendezVouses(Set<RendezVous> rendezVouses) {
		this.rendezVouses = rendezVouses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docteurs")
	public Set<Medicament> getMedicaments() {
		return this.medicaments;
	}

	public void setMedicaments(Set<Medicament> medicaments) {
		this.medicaments = medicaments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docteurs")
	public Set<Endorse> getEndorses() {
		return this.endorses;
	}

	public void setEndorses(Set<Endorse> endorses) {
		this.endorses = endorses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docteurs")
	public Set<Messages> getMessageses() {
		return this.messageses;
	}

	public void setMessageses(Set<Messages> messageses) {
		this.messageses = messageses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docteurs")
	public Set<Patients> getPatientses() {
		return this.patientses;
	}

	public void setPatientses(Set<Patients> patientses) {
		this.patientses = patientses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docteurs")
	public Set<Articles> getArticleses() {
		return this.articleses;
	}

	public void setArticleses(Set<Articles> articleses) {
		this.articleses = articleses;
	}

}
