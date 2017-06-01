package med.app.Model;
// Generated 22 mars 2017 01:15:28 by Hibernate Tools 5.2.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RendezVous generated by hbm2java
 */
@Entity
@Table(name = "rendez-vous", catalog = "e_med")
public class RendezVous implements java.io.Serializable {

	private Integer idRdv;
	private Docteurs docteurs;
	private Patients patients;
	private Date dateRdv;
	private String heureRdv;

	public RendezVous() {
	}

	public RendezVous(Docteurs docteurs, Patients patients, Date dateRdv, String heureRdv) {
		this.docteurs = docteurs;
		this.patients = patients;
		this.dateRdv = dateRdv;
		this.heureRdv = heureRdv;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_rdv", unique = true, nullable = false)
	public Integer getIdRdv() {
		return this.idRdv;
	}

	public void setIdRdv(Integer idRdv) {
		this.idRdv = idRdv;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_doc_rdv", nullable = false)
	public Docteurs getDocteurs() {
		return this.docteurs;
	}

	public void setDocteurs(Docteurs docteurs) {
		this.docteurs = docteurs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_patient_rdv", nullable = false)
	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_rdv", nullable = false, length = 10)
	public Date getDateRdv() {
		return this.dateRdv;
	}

	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}

	@Column(name = "heure_rdv", nullable = false, length = 20)
	public String getHeureRdv() {
		return this.heureRdv;
	}

	public void setHeureRdv(String heureRdv) {
		this.heureRdv = heureRdv;
	}

}
