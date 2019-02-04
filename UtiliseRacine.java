import java.util.*;

public class UtiliseRacine 
{ 
    public static void main(String[] argv) 
    { 
        Scanner scanner; 
        scanner = new Scanner(System.in); 
        Racine extracteur = new Racine(0.01);
        double operande = -1;

        while (operande < 0) 
        {
            try
            {
                System.out.print("Chose a positive double : ");
                operande = scanner.nextDouble();
                if (operande < 0)              
                    throw new InputMismatchException();
            }
            catch (InputMismatchException e)
            {
                System.out.println("The input must be > 0");
                
                System.out.printf("Chose an other double : ");
                operande = scanner.nextDouble();
            }
        }
        
        double valeurRacine; 
 
        valeurRacine = extracteur.racine(operande); 
        System.out.println(valeurRacine); 
        System.out.println("precision " + extracteur.getPrecision() + " , erreur =" + (valeurRacine-Math.sqrt(operande)));
        
        extracteur.setPrecision(0.00001); 
        
        valeurRacine = extracteur.racine(operande); 
        System.out.println(valeurRacine); 
        System.out.println("precision "+extracteur.getPrecision() + " , erreur =" + (valeurRacine-Math.sqrt(operande)));  
    }  
}