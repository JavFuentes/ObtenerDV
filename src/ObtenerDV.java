public class ObtenerDV {
	
	/**
	 * Función que recibe un RUT como String y retorna el digito verificador de dicho RUT:
	 */	
	public String obtenerDV(String rut) {			
		 int suma = 0;
		 int factor = 2;
		 
		 for (int i = rut.length() - 1; i >= 0; i--) {			 
		        suma += Integer.valueOf(String.valueOf(rut.charAt(i))) * factor;		       
		        if(factor < 7) {
		        	factor++;		        	
		        	}
				else {
				  	factor = 2;
					}
		        }
		 
		int dv = 11 - (suma % 11);
		return (dv == 11) ? "0" : (dv == 10) ? "K" : String.valueOf(dv);		
	}			
}
