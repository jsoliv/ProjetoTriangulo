
package aula04;
public class Caneta {
   public String modelo, cor;
   private float ponta;
   private boolean tampada;
   
   
   public Caneta(String m, String c, float p) { // Este do'e o meto Construtor
       this.modelo = m;
       this.cor = c;
       this.setPonta(p);
       this.tampar();
       this.cor = "Azul";
    }
   
   public void tampar() {
       this.tampada = true;
   }
    public void destampar () {
       this.tampada = false;
   }
   
   public String getModelo() {
       return this.modelo;
   }
   
   public void setModelo(String m){
       this.modelo = m;
   }
   
   public float getPonta(){
       return this.ponta;
   }
   public void setPonta(float p){
       this.ponta = p;
   }
   
  public void status() {
       System.out.println("Sobre a caneta");
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Ponta: " + this.getPonta());
       System.out.println("Tampada " + this.tampada);
   }
}
