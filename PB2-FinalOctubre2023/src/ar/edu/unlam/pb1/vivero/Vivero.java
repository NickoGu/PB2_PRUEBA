package ar.edu.unlam.pb1.vivero;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Vivero {

	private String nombre;

	// No se pueden registrar plantas duplicadas. 2 plantas son iguales cuando tiene
	// el mismo Id
	private Set<Planta> plantas;
	private List<Planta> ventas;

	public Vivero(String nombre) {
		this.nombre = nombre;
		this.plantas = new HashSet<Planta>();
	}

	// No puede haber 2 plantas con el mismo Id , Si se duplica lanza una Exception
	// Planta Duplicada Exception
	public Boolean agregarPlanta(Planta planta) throws Exception {
		Boolean seAgrego = false;

		if (plantas.contains(planta) == false) {
			plantas.add(planta);
			seAgrego = true;
		} else {
			throw new Exception("La planta ya existe.");
		}

		return seAgrego;
	}

	/*
	 * Registra una venta y descuenta del stock de la planta la cantidad deseada. Si
	 * no se encuentra la planta lanza una exception Planta Inexistente. Si no hay
	 * Stock Lanza Una Exception ProdutoSinStockException
	 */
	public void venderPlanta(Integer codigoPlanta, Integer cantidadAVender) throws Exception {
		Planta plantaEncontrada = null;
		for (Planta planta : plantas) {
			if (planta.getCodigo() == codigoPlanta) {
				plantaEncontrada = planta;
				if (plantaEncontrada.getStock() < cantidadAVender) {
					throw new ProductoSinStockExcetption();
				}
			} else {
				throw new Exception("Planta inexistente");
			}

		}

	}

	/*
	 * Obtener un listado de todos los arboles vendidos ordenados por el total de
	 * venta (Cantidad * precioDeLaPlanta)
	 * 
	 */
	public ______ obtenerTodasLasVentasDeArbolesOrdenadosPorElValorTotalDeLaVenta() {

		return null;
	}

	/*
	 * Obtener Un reporte de las plantas vendidas agrupados por tipo Plantas
	 * 
	 * 
	 * Ejemplo: para una key "arbol", debemos completar las plantas de este tipo
	 * 
	 */

	public Map<String, ______> obtenerReporteDePlantasAgrupadasPorTipo() {
		return null;
	}

	/**
	 * Obtener una lista de plantas que implementen la interfaz correspondiente
	 */
	public List<Florales> obtenerTodasLasPlantasFlorales() {
	}
}
