package com.hbt.semillero.entidad;

import java.math.BigDecimal;


//clase que represneta las caracteristicas de un vehiculo
public class Vehiculo {

	private String color;
	private String marca;
	private TipoVehiculo tipoVehiculo;
	private int numeroLlantas;
	private int numeroHacientos;
	private boolean requierelicencia;
	private BigDecimal precio;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getNumeroLlantas() {
		return numeroLlantas;
	}

	public void setNumeroLlantas(int numeroLlantas) {
		this.numeroLlantas = numeroLlantas;
	}

	public int getNumeroHacientos() {
		return numeroHacientos;
	}

	public void setNumeroHacientos(int numeroHacientos) {
		this.numeroHacientos = numeroHacientos;
	}

	public boolean isRequierelicencia() {
		return requierelicencia;
	}

	public void setRequierelicencia(boolean requierelicencia) {
		this.requierelicencia = requierelicencia;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}
