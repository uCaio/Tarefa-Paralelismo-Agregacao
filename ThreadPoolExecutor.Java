import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class Main {
    public static void main(String [] args){
        ExecutorService executor = Executors.newFixedThreadPool(2);

        LinhaProducao carro1 = new LinhaProducao("Carroceria A", "Motor V8", "4 Portas", "Rodas de Liga Leve");
        LinhaProducao carro2 = new LinhaProducao("Carroceria B", "Motor V6", "2 Portas", "Rodas Esportivas");
        LinhaProducao carro3 = new LinhaProducao("Carroceria C", "Motor Elétrico", "3 Portas", "Rodas Convencionais");
        LinhaProducao carro4 = new LinhaProducao("Carroceria D", "Motor Diesel", "2 Portas", "Rodas Off-Road");

        executor.execute(carro1);
        executor.execute(carro2);
        executor.execute(carro3);
        executor.execute(carro4);

        executor.shutdown();
    }
}