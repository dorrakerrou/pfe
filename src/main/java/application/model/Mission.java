package application.model;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="MISSION")
public class Mission implements Serializable{
	    
	    @EmbeddedId
        protected MissionPK missionPK;
	    
	    @Column(name = "OBJETA")
	    private String objeta;
	    
	    @Column(name = "OBJETL")
	    private String objetl ; 
	    
	    @Column(name = "DATDEP_P")
	    private Date datdepP;
	
	    @Column(name = "DATARR_P")
	    private Date datarrP;

	   
	    

	    @JoinColumn(name = "CODE", insertable=false , updatable=false )
	    @ManyToOne
	    private DeptGen deptGen;
	    
	    
	    @ManyToOne
		private Motcle Motcle;
	    
	    
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mission")
	    @JsonIgnore
	    private Collection<OrdMis> ordMisCollection;
	    

		public Mission(MissionPK missionPK, String objeta, String objetl, Date datdepP, Date datarrP, String codeMotcle,
				String codetheme) {
			super();
			this.missionPK = missionPK;
			this.objeta = objeta;
			this.objetl = objetl;
			this.datdepP = datdepP;
			this.datarrP = datarrP;
			
		}

	


		public Mission() {
			super();
			// TODO Auto-generated constructor stub
		}

		public MissionPK getMissionPK() {
			return missionPK;
		}

		public void setMissionPK(MissionPK missionPK) {
			this.missionPK = missionPK;
		}

		public String getObjeta() {
			return objeta;
		}

		public void setObjeta(String objeta) {
			this.objeta = objeta;
		}

		public String getObjetl() {
			return objetl;
		}

		public void setObjetl(String objetl) {
			this.objetl = objetl;
		}

		public Date getDatdepP() {
			return datdepP;
		}

		public void setDatdepP(Date datdepP) {
			this.datdepP = datdepP;
		}

		public Date getDatarrP() {
			return datarrP;
		}

		public void setDatarrP(Date datarrP) {
			this.datarrP = datarrP;
		}

	




		public DeptGen getDeptGen() {
			return deptGen;
		}



		public void setDeptGen(DeptGen deptGen) {
			this.deptGen = deptGen;
		}




		public Motcle getMotcle() {
			return Motcle;
		}




		public void setMotcle(Motcle motcle) {
			Motcle = motcle;
		}




		public Collection<OrdMis> getOrdMisCollection() {
			return ordMisCollection;
		}




		public void setOrdMisCollection(Collection<OrdMis> ordMisCollection) {
			this.ordMisCollection = ordMisCollection;
		}
       
	   
    

}
