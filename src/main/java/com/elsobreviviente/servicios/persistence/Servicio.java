package com.elsobreviviente.servicios.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idCodigoServicio;

    private String codigoServicio;

    private String nombreServicio;
    
    /*MAPEA UNA RELACION DE MUCHA A UNA ENTRE DOS TABLAS*/
    @JoinColumn ( name = "codigo_tipo_servicio", referencedColumnName = "codigo_tipo_servicio" )
    @ManyToOne
    private TipoServicio tipoServicio;
    
    
    
    public Long getIdCodigoServicio() {
        return idCodigoServicio;
    }

    public void setIdCodigoServicio(Long idCodigoServicio) {
        this.idCodigoServicio = idCodigoServicio;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

   

    
    public TipoServicio getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(TipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

}
