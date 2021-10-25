package com.hbt.semillero.enunm;

public enum EstadoEnum {
	VENDIDO("Vendido"),
	COMPRADO("comprado");
	
	private String estado;
	

	private EstadoEnum(String estado) {
		this.estado = estado;
	}


	public String getEstado() {
		return estado;
	}

}
