package aula02;
public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   public int carga;
   protected boolean tampada;
     // crir mais um metodo para mostrar o status
   public void status () {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Carga " + this.carga);  
        System.out.println("Esta tampada? " + this.tampada);
    }
    // criar os metodos
    protected void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO: nao posso radiscar!");
            } else {
            System.out.println("Estou rabiscando");
        }
    }
    protected void tampar() {
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}
