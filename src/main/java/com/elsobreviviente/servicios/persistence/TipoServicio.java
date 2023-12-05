package com.elsobreviviente.servicios.persistence;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name ="tipo_servicio")
public class TipoServicio {

    @Id
    @Column (name ="codigo_tipo_servicio")
    private String codigoTipoServicio;

    @Column (name ="nombre_tipo_servicio")
    private String nombreTipoServicio;
    
    @OneToMany ( mappedBy = "tipoServicio" )
    private List<Servicio> servicioList = new ArrayList<>();
    
    

	public String getCodigoTipoServicio() {
		return codigoTipoServicio;
	}

	public void setCodigoTipoServicio(String codigoTipoServicio) {
		this.codigoTipoServicio = codigoTipoServicio;
	}

	public String getNombreTipoServicio() {
		return nombreTipoServicio;
	}

	public void setNombreTipoServicio(String nombreTipoServicio) {
		this.nombreTipoServicio = nombreTipoServicio;
	}

	public List<Servicio> getServicioList() {
		return servicioList;
	}

	public void setServicioList(List<Servicio> servicioList) {
		this.servicioList = servicioList;
	}
	
	

  
    
    
    

}