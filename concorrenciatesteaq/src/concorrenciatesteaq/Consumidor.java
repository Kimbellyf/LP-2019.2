package concorrenciatesteaq;

public class Consumidor extends Thread{
	private int idconsumidor;
	private Tanque tanquepilhaq;
	private int consumirtotal;
	
	public Consumidor() {
		
	}
	public Consumidor(int idconsumidor, Tanque tanquepilhaq, int consumirtotal) {
		this.idconsumidor = idconsumidor;
		this.tanquepilhaq = tanquepilhaq;
		this.consumirtotal = consumirtotal;
		
	}
	public void run() {
		for(int i=0; i<consumirtotal; i++) {
			tanquepilhaq.consumir(idconsumidor, consumirtotal);
		}

	System.out.println("Consumidor #" + idconsumidor + " concluído");
	}
	

}
