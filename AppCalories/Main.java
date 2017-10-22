public class Main{
    public static void main(String[] args){
        AlimentoBase pomodoro= new AlimentoBase();
        AlimentoBase farina= new AlimentoBase();
        
        String nomeP = "pomodoro";
        String nomeF = "farina";
        String descP = "Il pomodoro è un alimento ideale per una dieta";
        String descF = "La farina è un alimento semi-ideale per una dieta";
        
        pomodoro.setNome(nomeP);
        farina.setNome(nomeF);
        pomodoro.setDesc(descP);
        farina.setDesc(descF);
        
        
        pomodoro.setKcal(120);
        farina.setKcal(10);
        
        System.out.println("Nome alimento:"+ pomodoro.getNome()+". Descrizione alimento:"+ pomodoro.getDesc()+". Kcal alimento:"+ pomodoro.getKcal());
        System.out.println("Nome alimento:"+ farina.getNome()+". Descrizione alimento:"+ farina.getDesc()+". Kcal alimento:"+ farina.getKcal());
    }
}