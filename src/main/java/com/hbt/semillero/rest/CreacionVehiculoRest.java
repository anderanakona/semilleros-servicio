package com.hbt.semillero.rest;

import java.math.BigDecimal;

import com.hbt.semillero.entidad.TipoVehiculo;
import com.hbt.semillero.entidad.Vehiculo;

public class CreacionVehiculoRest {

	public static void main(String[] args) {
	Vehiculo vehiculo1= new Vehiculo();
	vehiculo1.setColor("negro");
	vehiculo1.setMarca("cherolev");
	vehiculo1.setTipoVehiculo(TipoVehiculo.ACUATICO);
	vehiculo1.setRequierelicencia(true);
	vehiculo1.setNumeroHacientos(20);
	vehiculo1.setNumeroLlantas(4);
	vehiculo1.setPrecio(new BigDecimal(30000));
	System.out.print("el tipo de vehiculo es "+ vehiculo1.getTipoVehiculo());
	}

}
