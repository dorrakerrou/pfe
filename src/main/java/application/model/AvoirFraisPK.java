package application.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class AvoirFraisPK implements Serializable {

 
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "NUM_MISSION")
    private String numMission;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMORD")
    private short numord;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "TYP_FRAIS")
    private String typFrais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_PAYS")
    private String codPays;
    
    @Column(name = "CIN")
    private String cin;
    
    

    public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public AvoirFraisPK() {
    }


	public String getNumMission() {
		return numMission;
	}

	public void setNumMission(String numMission) {
		this.numMission = numMission;
	}

	public short getNumord() {
		return numord;
	}

	public void setNumord(short numord) {
		this.numord = numord;
	}

	public String getTypFrais() {
		return typFrais;
	}

	public void setTypFrais(String typFrais) {
		this.typFrais = typFrais;
	}

	public String getCodPays() {
		return codPays;
	}

	public void setCodPays(String codPays) {
		this.codPays = codPays;
	}

	public AvoirFraisPK(
			@NotNull @Size(min = 1, max = 6) String numMission, @NotNull short numord,
			@NotNull @Size(min = 1, max = 2) String typFrais, @NotNull @Size(min = 1, max = 2) String codPays) {
		super();
		this.numMission = numMission;
		this.numord = numord;
		this.typFrais = typFrais;
		this.codPays = codPays;
	}
    
	
}
