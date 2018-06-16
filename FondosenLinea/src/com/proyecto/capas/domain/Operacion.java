package com.proyecto.capas.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "administrador", name = "operacion")
public class Operacion {
	
	@Id
	@Column(name = "c_operacion")
	private Integer coperacion;
	
	@Column(name = "b_tipo")
	private Boolean btipo;
	
	@Column(name = "f_operacion")
	private Calendar foperacion;
	
	@Column(name = "d_monto")
	private Double dmonto;
	
	@Column(name = "s_concepto")
	private String sconcepto;
	
	@Column(name = "u_cuentaemisora")
	private Cuenta ucuentaemisora;
	
	@Column(name = "u_cuentareceptora")
	private Cuenta ucuentareceptora;
	
	@Column(name = "i_estado")
	private Integer iestado;

	public Integer getCoperacion() {
		return coperacion;
	}

	public void setCoperacion(Integer coperacion) {
		this.coperacion = coperacion;
	}

	public Boolean getBtipo() {
		return btipo;
	}

	public void setBtipo(Boolean btipo) {
		this.btipo = btipo;
	}

	public Calendar getFoperacion() {
		return foperacion;
	}

	public void setFoperacion(Calendar foperacion) {
		this.foperacion = foperacion;
	}

	public Double getDmonto() {
		return dmonto;
	}

	public void setDmonto(Double dmonto) {
		this.dmonto = dmonto;
	}

	public String getSconcepto() {
		return sconcepto;
	}

	public void setSconcepto(String sconcepto) {
		this.sconcepto = sconcepto;
	}

	public Cuenta getUcuentaemisora() {
		return ucuentaemisora;
	}

	public void setUcuentaemisora(Cuenta ucuentaemisora) {
		this.ucuentaemisora = ucuentaemisora;
	}

	public Cuenta getUcuentareceptora() {
		return ucuentareceptora;
	}

	public void setUcuentareceptora(Cuenta ucuentareceptora) {
		this.ucuentareceptora = ucuentareceptora;
	}

	public Integer getIestado() {
		return iestado;
	}

	public void setIestado(Integer iestado) {
		this.iestado = iestado;
	}
	
	public String getFechaOpeDelegate() {
		if(this.foperacion ==  null) {
			return "";
		}
		else {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			String date = sdf.format(this.foperacion.getTime());
			return date;
		}
	}
	
	public String getEstadoDelegate() {
		if(this.iestado == null) {
			return "";
		}
		else {
			if(iestado == 0)
				return "Pendiente";
			else if(iestado == 1)
				return "Realizada";
			else
				return "Rechazado";
		}
	}
	
	public String getTipoDelegate() {
		if(this.btipo == null) {
			return "";
		}
		else {
			if(btipo)
				return "Débito";
			else {
				return "Crédito";
			}
		}
	}
	
	public String getMontoDelegate() {
		if(this.dmonto == null)
			return "";
		else {
			return "$"+String.valueOf(this.dmonto);
		}
	}
}


