public class Produtor implements Runnable {
    private Deposito item;
    private int number;

    public Produtor(Deposito d, int number) {
        item = d;
        this.number = number;
    }

    public void run() {
            for(int i =0; i < number; i++){
            	item.colocar();
            }
    }
}
