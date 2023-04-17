package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "HBR_COLORES")
public class parametros {
	@Id
	private String NOMBRE;
	private String ESTADO;
	private String OBSERVACIONES;
	private String USUARIO; 
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	private Date  FECHAMODIFICACION;
	

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getESTADO() {
		return ESTADO;
	}

	public void setESTADO(String eSTADO) {
		ESTADO = eSTADO;
	}

	public String getOBSERVACIONES() {
		return OBSERVACIONES;
	}

	public void setOBSERVACIONES(String oBSERVACIONES) {
		OBSERVACIONES = oBSERVACIONES;
	}

	public String getUSUARIO() {
		return USUARIO;
	}

	public void setUSUARIO(String uSUARIO) {
		USUARIO = uSUARIO;
	}
	public Date getFECHAMODIFICACION() {
		return FECHAMODIFICACION;
	}

	public void setFECHAMODIFICACION(Date fECHAMODIFICACION) {
		FECHAMODIFICACION = fECHAMODIFICACION;
	}


	
}
