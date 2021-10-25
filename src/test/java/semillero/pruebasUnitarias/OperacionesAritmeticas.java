package semillero.pruebasUnitarias;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

//documentacion del codigo para que sirbe
//
public class OperacionesAritmeticas {

	private final static Logger log=Logger.getLogger(OperacionesAritmeticas.class);
	
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure();
	}
	// metodo para la creacion de la prueba unitaria
	@Test		
	public void validarResultadoSumaExitoso() {
		log.info("inicio de metodo del metodo de la suma");
		int numero1=300;
		int numero2=40;
		
		int resultado=340;
		
		Assert.assertEquals(resultado, numero1+numero2);
		
		log.info("fin de metodo del metodo de la suma");
	}
	
	@Test
	public void validarResultadoSumaFallida() {
		log.info("inicio de metodo del metodo de la suma");
		int numero1=300;
		int numero2=40;
		try {			
			this.sumar(numero1, numero2);			
		} catch (Exception e) {
			// TODO: handle exception
			Assert.assertEquals(e.getMessage(),"LA suma a fallado");
		}		
		
		log.info("fin de metodo del metodo de la suma");
	}
	
	private Integer sumar(int numero1, int numero2) throws Exception {
		int resultado=233;
		if(resultado!=(numero1+numero2)) {
			log.info("Se genero un error en la suma");
			throw new Exception("LA suma a fallado");
		}
		return resultado;
	}
	@AfterTest
	public void finalizarPruebasUnitarias() {
		log.info("Finalizand ¿o las pruebas unitarias");
	}
}
