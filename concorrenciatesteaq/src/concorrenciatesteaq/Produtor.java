package concorrenciatesteaq;

public class Produtor extends Thread{
	private int idprodutor;
	private Tanque tanquepilha;
	private int produzirtotal;

	public Produtor() {
		
	}
	public Produtor(int id, Tanque p, int produzirtotal) {
		idprodutor = id;
		tanquepilha = p;
		this.produzirtotal = produzirtotal;
		
	}
	public void run() {
		for(int i=0; i<produzirtotal; i++) {
			tanquepilha.adicionar(idprodutor, produzirtotal);
		}

	System.out.println("Produtor #" + idprodutor + " concluído");
	}
}
