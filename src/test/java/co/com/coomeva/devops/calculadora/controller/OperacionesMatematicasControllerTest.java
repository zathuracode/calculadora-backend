package co.com.coomeva.devops.calculadora.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class OperacionesMatematicasControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	
	void debeSumarDosNumeros()throws Exception {
		//Arrange
		Integer n1=2;
		Integer n2=4;
		MvcResult mvcResult=null;		
		
		//Act
		mvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/operaciones/sumar/"+n1+"/"+n2)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.resultado").value("6"))
				.andReturn();
		
		//Assert		
		assertEquals("application/json",mvcResult.getResponse().getContentType());
		
	}

}
