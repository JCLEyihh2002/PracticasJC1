package com.wizeline.utils.excepcion;

public class ExceptionGenerica extends RuntimeException {
	
    public ExceptionGenerica(String mensajeError) {
    	
        super(mensajeError);
    }
}