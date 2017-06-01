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
 * Articles generated by hbm2java
 */
@Entity
@Table(name = "articles", catalog = "e_med")
public class Articles implements java.io.Serializable {

	private Integer idArticle;
	private Docteurs docteurs;
	private String titreArticle;
	private String contenuArticle;

	public Articles() {
	}

	public Articles(Docteurs docteurs, String titreArticle, String contenuArticle) {
		this.docteurs = docteurs;
		this.titreArticle = titreArticle;
		this.contenuArticle = contenuArticle;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_article", unique = true, nullable = false)
	public Integer getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(Integer idArticle) {
		this.idArticle = idArticle;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_doc_article", nullable = false)
	public Docteurs getDocteurs() {
		return this.docteurs;
	}

	public void setDocteurs(Docteurs docteurs) {
		this.docteurs = docteurs;
	}

	@Column(name = "titre_article", nullable = false, length = 50)
	public String getTitreArticle() {
		return this.titreArticle;
	}

	public void setTitreArticle(String titreArticle) {
		this.titreArticle = titreArticle;
	}

	@Column(name = "contenu_article", nullable = false)
	public String getContenuArticle() {
		return this.contenuArticle;
	}

	public void setContenuArticle(String contenuArticle) {
		this.contenuArticle = contenuArticle;
	}

}
