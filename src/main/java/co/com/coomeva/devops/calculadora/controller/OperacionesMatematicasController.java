package co.com.coomeva.devops.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.coomeva.devops.calculadora.dto.ResultadoDTO;
import co.com.coomeva.devops.calculadora.service.OperacionesMatematicasService;

@RestController
@RequestMapping("/operaciones/")
@CrossOrigin("*")
public class OperacionesMatematicasController {
	
	@Autowired
	OperacionesMatematicasService operacionesMatematicasService;
	
	@GetMapping("sumar/{n1}/{n2}")
	 public ResultadoDTO sumar(@PathVariable("n1") Integer n1, @PathVariable("n2") Integer n2)throws Exception{
		Integer resultado=operacionesMatematicasService.sumar(n1, n2);
		return new ResultadoDTO(resultado);
	 }

}
