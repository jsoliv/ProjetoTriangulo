package aula04;
public class Aula04 {
    public static void main(String[] args) {
       // Caneta c1 = new Caneta();
       // c1.setModelo("BiC");
       // c1.setPonta(0.5f);
       // c1.status();
        
      //  System.out.println("Tenho uma caneta modelo " + c1.getModelo()
      //  + "de ponta " + c1.getPonta());
      
            
      Caneta c1 = new Caneta("Montblanc", "Amarela", 0.4f);
      c1.status();
      Caneta c2 = new Caneta("Rivelle", "Preta", 0.4f);
      c2.status();
    }
}
    
