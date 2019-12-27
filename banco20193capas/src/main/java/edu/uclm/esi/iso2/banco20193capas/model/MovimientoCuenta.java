package edu.uclm.esi.iso2.banco20193capas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *Representa un movimiento en una cuenta bancaria
 */
@Entity
public class MovimientoCuenta {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Cuenta cuenta;
	private double importe;
	private String concepto;
	public MovimientoCuenta() {
	}
	public MovimientoCuenta(final Cuenta cuenta,
			final double importe, final String concepto) {
		this.importe = importe;
		this.concepto = concepto;
		this.cuenta = cuenta;
	}
	/*
	 *@return id
	 */
	public Long getId() {
		return id;
	}
	/*
	 *@param id	identificador
	 */
	public void setId(final Long id) {
		this.id = id;
	}
	/*
	 * @return cuenta objeto cuienta
	 */
	public Cuenta getCuenta() {
		return cuenta;
	}
	/*
	 *@param cuenta cuenta
	 */
	public void setCuenta(final Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	/*
	 * @return importe importe
	 */
	public double getImporte() {
		return importe;
	}
	/*
	 *@param cuenta cuenta
	 */
	public void setImporte(final double importe) {
		this.importe = importe;
	}
	/*
	 * @return concepto concepto
	 */
	public String getConcepto() {
		return concepto;
	}
	/*
	 *@param cuenta cuenta
	 */
	public void setConcepto(final String concepto) {
		this.concepto = concepto;
	}
}
