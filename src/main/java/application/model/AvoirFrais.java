package application.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
@Table(name = "AVOIR_FRAIS")
@XmlRootElement
public class AvoirFrais implements Serializable {
	
    @EmbeddedId
    protected AvoirFraisPK avoirFraisPK;

    @Basic(optional = false)
    @NotNull
    @Column(name = "VALEUR_P")
    private BigDecimal valeurP;
    
    @Column(name = "VALEUR_R")
    
    private BigDecimal valeurR;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "SUPPORTE")
    
    private String supporte;
    @Size(max = 6)
    @Column(name = "SUP_CODE")
    private String supCode;
    
    @Size(max = 2)
    @Column(name = "COD_PRJ")
    private String codPrj;
    
    @Size(max = 120)
    @Column(name = "OBSERV")
    private String observ;
    
    @Size(max = 120)
    @Column(name = "AOBSERV")
    private String aobserv;
 

    @JoinColumns({
        @JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false),
        @JoinColumn(name = "CIN", referencedColumnName = "CIN", insertable = false, updatable = false)
        , @JoinColumn(name = "NUMORD", referencedColumnName = "NUMORD", insertable = false, updatable = false)
        , @JoinColumn(name = "NUM_MISSION", referencedColumnName = "NUM_MISSION", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private OrdMis ordMis;
    
    
    @JoinColumn(name = "COD_PAYS", referencedColumnName = "COD_PAYS", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Pays pays;
    
    @JoinColumn(name = "TYP_FRAIS", referencedColumnName = "TYP_FRAIS", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TypFrais typFrais1;

	public AvoirFraisPK getAvoirFraisPK() {
		return avoirFraisPK;
	}

	public void setAvoirFraisPK(AvoirFraisPK avoirFraisPK) {
		this.avoirFraisPK = avoirFraisPK;
	}

	public BigDecimal getValeurP() {
		return valeurP;
	}

	public void setValeurP(BigDecimal valeurP) {
		this.valeurP = valeurP;
	}

	public BigDecimal getValeurR() {
		return valeurR;
	}

	public void setValeurR(BigDecimal valeurR) {
		this.valeurR = valeurR;
	}

	public String getSupporte() {
		return supporte;
	}

	public void setSupporte(String supporte) {
		this.supporte = supporte;
	}

	public String getSupCode() {
		return supCode;
	}

	public void setSupCode(String supCode) {
		this.supCode = supCode;
	}

	public String getCodPrj() {
		return codPrj;
	}

	public void setCodPrj(String codPrj) {
		this.codPrj = codPrj;
	}

	public String getObserv() {
		return observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}

	public String getAobserv() {
		return aobserv;
	}

	public void setAobserv(String aobserv) {
		this.aobserv = aobserv;
	}


	public OrdMis getOrdMis() {
		return ordMis;
	}

	public void setOrdMis(OrdMis ordMis) {
		this.ordMis = ordMis;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public TypFrais getTypFrais1() {
		return typFrais1;
	}

	public void setTypFrais1(TypFrais typFrais1) {
		this.typFrais1 = typFrais1;
	}
    

	
}
