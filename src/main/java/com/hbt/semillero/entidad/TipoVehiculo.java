package com.hbt.semillero.entidad;

public enum TipoVehiculo {
	TERRESTRE("terrestre"),
	ACUATICO("acuatico"),
	AEREO("aereo");
	
	private String tipo;
	

	private TipoVehiculo(String tipo) {
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}

}
