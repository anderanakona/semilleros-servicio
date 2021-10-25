package com.hbt.semillero.enunm;

public enum EstadoEnum {
	VENDIDO("Vendido"),
	COMPRADO("comprado");
	
	private String tipo;
	

	private EstadoEnum(String tipo) {
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}

}
