package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
     // crir mais um metodo para mostrar o status
    void status () {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Carga " + this.carga);  
        System.out.println("Esta tampada? " + this.tampada);
    }
    // criar os metodos
    void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO: nao posso radiscar!");
            } else {
            System.out.println("Estou rabiscando");
        }
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
