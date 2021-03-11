public class Actividad4101 {
    public boolean esAnoBisiesto(int ano) {
        boolean anoBisiesto = false;
        if ((ano % 4) == 0){
            if ((ano % 100) == 0){
                if ((ano % 400) == 0){
                    anoBisiesto = true;
                }
            }else{
                anoBisiesto = true;
            }
        }
        return anoBisiesto;
    }
}