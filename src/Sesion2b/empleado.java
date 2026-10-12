package Sesion2b;

public class empleado {

	public enum tipoEmpleado{vendedor, encargado};
	
	public float calculoNominaBruta(tipoEmpleado tipo, float ventasMes, float horasExtras ) {
	   float salario=0;
	    
	      if(tipo==tipoEmpleado.vendedor &&  ventasMes <=999) {
	    	  salario = 2000 +30*horasExtras;
	    	  return salario;
	      }  else if(tipo==tipoEmpleado.vendedor && ventasMes >999 && ventasMes<=1499) {
	    	  
	    	  salario= 2000 +100+ 30*horasExtras;
	    	  return salario;
	      } else if(tipo==tipoEmpleado.vendedor && ventasMes >=1500) {
	    	  
	    	  salario= 2000 +200+ 30*horasExtras;
	    	  return salario;
	      }  else if(tipo==tipoEmpleado.encargado &&  ventasMes <=999) {
	    	  salario = 2500 +30*horasExtras;
	    	  return salario;
	      } else if(tipo==tipoEmpleado.encargado && ventasMes >999 && ventasMes<=1499) {
	    	  
	    	  salario= 2500 +100+ 30*horasExtras;
	    	  return salario;
	      } else if(tipo==tipoEmpleado.encargado && ventasMes >=1500) {
	    	  
	    	  salario= 2500 +200+ 30*horasExtras;
	    	  return salario;
	      }else return salario=0;
	      
	      
	
	}
	
	public float calculoNominaNeta(float nominaBruta) {
		 float retencion=(float) 0.00;
		if(nominaBruta <=2100) {
			return nominaBruta*(1-retencion);
			
		}else if(nominaBruta> 2100 && nominaBruta<2500) {
			retencion= (float) 0.15;
			return nominaBruta*(1-retencion);
			
		} else if(nominaBruta >= 2500 ) {
			retencion = (float) 0.18;
			return nominaBruta*(1-retencion);
			
		}else 
		return  0;
		
		
		
	}
	
	
}
