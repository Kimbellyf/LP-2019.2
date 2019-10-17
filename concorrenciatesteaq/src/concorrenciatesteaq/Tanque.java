package concorrenciatesteaq;

//O produtor precisa esperar o buffer ficar livre para produzir o
//produto e o cliente precisa esperar o buffer ficar preenchido para consumir o produto.
public class Tanque {
	private int capacidade;
	private int nivel;
	private boolean disponivel;
	

	public Tanque() {
		
	}
	public Tanque(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public synchronized void adicionar(int idprodutor, int valorProduzir) {
		while(disponivel == true || nivel==10){
			try {
				System.out.println("Produtor #" + idprodutor + "  " + "esperando..." );
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		//disponivel = false;
		nivel +=valorProduzir;
		System.out.println("Produtor #" + idprodutor + " "+ "colocou" +" " + valorProduzir + " " +"e o nivel do tanque ficou " + nivel);
		//printarnivel();
		disponivel = true;
		notifyAll();
	}
	public void printarnivel() {
		System.out.println("nivel do tanque:"+nivel);
	}
	
	public synchronized int consumir(int idconsumidor, int valorConsumir) {
		while(disponivel == false & nivel==0) {
			try {
				System.out.println("Consumidor #" + idconsumidor +" " + "esperando..");
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		nivel -=valorConsumir;
		System.out.println("Consumidor #" + idconsumidor + " " +"consumiu:" + valorConsumir +" " + "e o nivel do tanque ficou:" +nivel);
		disponivel = false;
		notifyAll();
		return nivel;
		
	}

}
