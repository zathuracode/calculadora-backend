package co.com.coomeva.devops.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class OperacionesMatematicasServiceImpl implements OperacionesMatematicasService {

	@Override
	public Integer sumar(Integer n1, Integer n2) throws Exception {
		if(n1==null) {
    		throw new Exception("El n1 es nulo");
    	}
    	
    	if(n2==null) {
    		throw new Exception("El n2 es nulo");
    	}
    	
    	return n1+n2;
	}

}
