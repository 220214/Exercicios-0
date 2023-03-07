package Controller;

public class ThreadVetor extends Thread {
    private int num;
    private int[] vet;

    public ThreadVetor(int num, int[] vet) {
        this.num = num;
        this.vet = vet;
    }

    @SuppressWarnings("unused")
	public void run() {
        double inicio = System.nanoTime();
        if (num % 2 == 0) {
            for (int i = 0; i < vet.length; i++) {
                
            }
        } else {
            for (int value : vet) {
                
            }
        }
        double fim = System.nanoTime();

        double seconds = (double) (fim - inicio) / 1_000_000_000.0;
        System.out.println("Tempo para percorrer o vetor: " + seconds + " segundos");
    }
}
