package ej7Rel11;

public class Mercadona {
	private static final int NUM_CAJAS = 20;
	
	private Caja[]cajas;
	
	public Mercadona(Caja[] cajas) {
		cajas=new Caja[NUM_CAJAS];
		Caja caja = null;
		for (int i = 0; i < cajas.length; i++) {
			cajas[i]=caja;
		}
	}
	
	
	public void abrirCaja(int numCaja)throws MercadonaException {
		int i;
		boolean abierta=false;
		
		
		for (i = 0; i < cajas.length; i++) {
			abierta=cajas[i].isAbierta();
			
			if(abierta) {
				throw new MercadonaException("Error, la caja ya estaba abierta");
			}
			abierta=true;
		}
	}
	
	public void cerrarCaja(int numCaja) {
		boolean cerrada=false;
		
		
		
		
	}
	
}
