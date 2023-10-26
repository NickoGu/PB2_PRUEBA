package ar.edu.unlam.pb1.vivero;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVivero {

	/**
	 * Se deberan realizar los siguientes tests
	 * 
	 * - 1 test para el metodo agregarPlanta() que arroje la excepcion de validacion
	 * - 1 test para el metodo venderPlanta() que arroje una excepcion a eleccion -
	 * - 1 test para el metodo obtenerTodasLasVentasDeArbolesOrdenadosPorElValorTotalDeLaVenta()
	 * - 1 test para el metodo obtenerReporteDePlantasAgrupadasPorTipo()
	 * - 1 test para el metodo obtenerTodasLasPlantasFlorales()
	 * - 1 test para el metodo obtenerPrecio() de la clase Planta
	 * - 1 test para el metodo obtenerPrecio() de alguna clase que implemente la interfaz Florales en estado de floracion
	 * - 1 test para el metodo obtenerPrecio() de alguna clase que implemente la interfaz Florales en estado de produccion
	 * @throws Exception 
	 */

	@Test
	public void queSePuedaAgregarUnaPlanta() throws Exception {

		Planta planta = new Arbusto(1, "Arbusto", 21, 2);
		Vivero vivero = new Vivero("VIvero");
		
		Boolean seAgrego = vivero.agregarPlanta(planta);
		
		assertTrue(seAgrego);
	}

	@Test (expected = ProductoSinStockExcetption.class)
	public void queSePuedaVenderUnaPlanta() throws Exception {

		Planta planta = new Arbusto(1, "Arbusto", 21, 2);
		Vivero vivero = new Vivero("VIvero");
		
		vivero.agregarPlanta(planta);
		vivero.venderPlanta(planta.getCodigo(), 3);
		
		
	}
	
	@Test (expected = ProductoSinStockExcetption.class)
	public void obtenerTodasLasVentasDeArbolesOrdenadosPorElValorTotalDeLaVenta() throws Exception {

		Planta planta = new Arbusto(1, "Arbusto", 21, 2);
		Vivero vivero = new Vivero("VIvero");
		
		vivero.agregarPlanta(planta);
		vivero.venderPlanta(planta.getCodigo(), 3);
		
		vivero.obtenerTodasLasVentasDeArbolesOrdenadosPorElValorTotalDeLaVenta();
		
		
	}
	
	
}
