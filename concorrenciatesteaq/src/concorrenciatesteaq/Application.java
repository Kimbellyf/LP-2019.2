package concorrenciatesteaq;

public class Application {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Tanque tanqueCompartilhado = new Tanque(10);
		Produtor produtor1 = new Produtor(1, tanqueCompartilhado, 1);
		Produtor produtor2 = new Produtor(2, tanqueCompartilhado, 1);
		Consumidor consumidor1 = new Consumidor(1, tanqueCompartilhado, 1);
		Consumidor consumidor2 = new Consumidor(2, tanqueCompartilhado, 1);
		Consumidor consumidor3 = new Consumidor(3, tanqueCompartilhado, 1);
		Consumidor consumidor4 = new Consumidor(4, tanqueCompartilhado, 1);
		
		//produtor1.start();
		//produtor2.start();
		//consumidor1.start();
		//consumidor2.start();
		//consumidor3.start();
		//consumidor4.start();
		startAll(produtor1, produtor2, consumidor1, consumidor2, consumidor3,consumidor4);
		joinAll(produtor1, produtor2, consumidor1, consumidor2, consumidor3,consumidor4);
		
		System.out.println("Produção e consumos concluídos");
	}
	private static void startAll(Thread... threads) throws Exception {
		for(Thread t : threads) {
			t.start();
		}
	}
	private static void joinAll(Thread... threads) throws Exception {
		for(Thread t : threads) {
			t.join();
		}
	}

}
