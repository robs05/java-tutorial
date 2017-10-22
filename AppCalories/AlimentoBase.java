import java.io.*;
public class AlimentoBase
{
       private String nome;
       private String desc;
       private int kcal = 0;
       private int dieta = 0;
       
       
       public void setNome(String nome) {
           this.nome = nome;
       } 
       
       public String getNome() {
         return this.nome;
       }
       
       public void setKcal(int kcal) {
           if (kcal >= 0)
                this.kcal = kcal;
           else
                System.out.println("Attenzione kcal non è stato impostato perché non può assumere valore negativo");
    }
       public int getKcal() {
                      if(kcal>=100 && kcal<=250){
                dieta=kcal;
                System.out.println("La dieta è fattibile");
            }
           else
                System.out.println("La dieta non è fattibile con questo tipo di alimento");  
           return this.kcal;
        }
       public void setDesc(String desc){
           this.desc = desc;
        }
       public String getDesc(){
           return this.desc;
        }       
}
