

public class LinhaProducao implements Runnable{
    private String carroceria;
    private String motor;
    private String portas;
    private String rodas;


    public LinhaProducao(String carroceria, String motor, String portas, String rodas) {
        this.carroceria = carroceria;
        this.motor = motor;
        this.portas = portas;
        this.rodas = rodas;
    }


    public void setCarroceria(String aCarroceria) {
        this.carroceria = aCarroceria;
    }

    public String getCarroceria() {
        return this.carroceria;
    }

    public void setMotor(String oMotor) {
        this.motor = oMotor;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setPortas(String aPorta) {
        this.portas = aPorta;
    }

    public String getPortas() {
        return this.portas;
    }

    public void setRodas(String aRoda) {
        this.rodas = aRoda;
    }

    public String getRodas() {
        return this.rodas;
    }

    @Override
    public void run() {
        System.out.println("Iniciando a produção na thread: " + Thread.currentThread().getName());
        System.out.println("Montando carroceria: " + carroceria);
        System.out.println("Instalando motor: " + motor);
        System.out.println("Adicionando portas: " + portas);
        System.out.println("Colocando rodas: " + rodas);

        try{
            Thread.sleep(3000);;
        }catch(
            InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        
            System.out.println("Tarefa concluída na thread: "+Thread.currentThread().getName());
    }
}