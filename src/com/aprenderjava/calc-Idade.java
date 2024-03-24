import java.util.Scanner;

public class Main {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idadeEmDias= sc.nextInt();
        
        Anos anos = new Anos();
        int idadeEmAnos = anos.idadeEmAnos(idadeEmDias);
        
        Meses meses = new Meses();
        int idadeEmMeses = meses.idadeEmMeses(idadeEmDias);
        
        Dias dias = new Dias();
        int diasRestantes = dias.diasRestantes(idadeEmDias);
        
        System.out.println(idadeEmAnos + " ano(s)");
        System.out.println(idadeEmMeses + " mes(es)");
        System.out.println(diasRestantes + " dia(s)");
    }
}


class Anos{
    
    public int idadeEmAnos(int idadeEmDias) {
        if (idadeEmDias < 365){
            return 0;
        }
        else {
           int anos = idadeEmDias / 365;
            return anos;
        }
    }
} 

class Meses{
    
    public int idadeEmMeses(int idadeEmDias){
        int meses = (idadeEmDias % 365) / 30;
        return meses;
    }
}

class Dias {
    public int diasRestantes(int idadeEmDias){
        int dias = (idadeEmDias % 365) % 30;
        return dias;
    }
}