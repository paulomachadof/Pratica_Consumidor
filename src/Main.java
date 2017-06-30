
public class Main {

	public static void main(String[] args) {
		Deposito dep = new Deposito();
		Produtor p = new Produtor(dep, 5);
		Consumidor c = new Consumidor(dep, 1);
		Consumidor c2 = new Consumidor(dep, 2);

		
		//instanciando a thread produtor
		Thread t1 = new Thread(p);
		//instanciando a thread a consumidor
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c2);

		System.out.println("Execucao do main da classe Deposito terminada");
		
		t1.start();
	 //começa o segundo só quando o primeiro é executado
		try {
        t1.join();
		} catch (InterruptedException e) {
        e.printStackTrace();
		}
        t2.start();
        
    	try {
        t1.join();
    	} catch (InterruptedException e) {
        e.printStackTrace();
    	}
        t3.start();
	}
}
