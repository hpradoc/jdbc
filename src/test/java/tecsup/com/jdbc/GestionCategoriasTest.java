package tecsup.com.jdbc;

import java.util.Collection;
import junit.framework.Assert;
import tecsup.com.dao.DAOExcepcion;
import tecsup.com.modelo.Categoria;
import tecsup.com.negocio.GestionCategorias;

import org.junit.Test;

public class GestionCategoriasTest {
	
	//@Test
	public void insertarTest() {
	GestionCategorias negocio = new GestionCategorias();
	try {
	negocio.insertar("Electrónicos", "Categoria de electrónicos");
	Categoria nuevo = negocio.obtener(7);
	Assert.assertEquals("Categoria de electrónicos", nuevo.getDescripcion());
	} catch (DAOExcepcion e) {
	Assert.fail("Fallo la inserción: " + e.getMessage());
	}
	}
	 //@Test
	public void actualizarTest() {
	GestionCategorias negocio = new GestionCategorias();
	try {
	negocio.actualizar(7, "Electrónicos","Categoria de electrónicos 2");
	Categoria nuevo = negocio.obtener(7);
	Assert.assertEquals("Categoria de electrónicos 2", nuevo.getDescripcion());
	} catch (DAOExcepcion e) {
	Assert.fail("Falló la actualización: " + e.getMessage());
	}
	}
	///@Test
	public void listarTest() {
	GestionCategorias negocio = new GestionCategorias();
	try {
	Collection<Categoria> listado = negocio.listar();
	System.out.println(listado.size());
	
	Assert.assertTrue(listado.size() > 0);
	} catch (DAOExcepcion e) {
	Assert.fail("Falló el listado: " + e.getMessage());
	}
	}
	// @Test
	public void eliminarTest() {
	GestionCategorias negocio = new GestionCategorias();
	try {
	negocio.eliminar(8);
	Categoria nuevo = negocio.obtener(8);
	Assert.assertEquals(null, nuevo.getDescripcion());
	} catch (DAOExcepcion e) {
	Assert.fail("Falló la eliminición: " + e.getMessage());
	}
	
	
	}
	
	

}
 