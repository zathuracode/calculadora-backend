package co.com.coomeva.devops.calculadora.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class OperacionesMatematicasServiceTest {

	
	OperacionesMatematicasService operacionesMatematicasService=new OperacionesMatematicasServiceImpl();
	
	@Test
	public void debeSumarDosNumeros()throws Exception {
		//Arrange
		Integer n1=2;
		Integer n2=4;
		Integer resultado=0;
		
		//Act
		resultado=operacionesMatematicasService.sumar(n1, n2);
		
		//Assert		
		assertEquals(6, resultado);
		
	}
	
	@Test
	public void debeLanzarExceptionNumeroUno() {
		//Arrange
		Integer n1=null;
		Integer n2=4;
		String expectedMessage = "El n1 es nulo";
	    String actualMessage=null;

				
		//Act
		Exception exception =assertThrows(Exception.class, ()->{
			operacionesMatematicasService.sumar(n1, n2);
		});
		actualMessage=exception.getMessage();
		
		//Assert		
		assertTrue(actualMessage.contains(expectedMessage));
		
	}
	
	@Test
	public void debeLanzarExceptionNumeroDos() {
		//Arrange
		Integer n1=2;
		Integer n2=null;
		String expectedMessage = "El n2 es nulo";
	    String actualMessage=null;

				
		//Act
		Exception exception =assertThrows(Exception.class, ()->{
			operacionesMatematicasService.sumar(n1, n2);
		});
		actualMessage=exception.getMessage();
		
		//Assert		
		assertTrue(actualMessage.contains(expectedMessage));

	}

}
