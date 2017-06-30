
public class Consumidor implements Runnable {
	
	private Deposito item;
    private int number;

    public Consumidor(Deposito d, int number) {
    	item = d;
        this.number = number;
    }

    public void run() {
    	synchronized(item){
    		for(int i = 0; i < number; i++){
        		item.retirar();
        	}
         }
    }
}

