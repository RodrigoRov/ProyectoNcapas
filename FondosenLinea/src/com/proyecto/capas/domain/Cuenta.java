package com.proyecto.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "administrador",name = "cuentausuario")
public class Cuenta {

	
	@Id
	@Column(name = "c_cuenta")
	private Integer ccuenta;
	
	@Column(name = "s_username")
	private String susername;
	
	@Column(name = "s_password")
	private String spassword;
	
	@Column(name = "s_nombre")
	private String snombre;
	
	@Column(name = "s_apellido")
	private String sapellido;
}
