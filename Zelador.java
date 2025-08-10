import java.util.Scanner;

public class Zelador implements Alimentavel
{
    public String alimentação(){
        return "Sou o zelador Matheus";
    }
    
    public int alimentar(Alimentavel animal)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual a comida preferida do leão?");
        String respostaLeao = scanner.nextLine();
        System.out.println("O leão come "+respostaLeao);
        System.out.println("Qual a comida preferida da girafa?");
        String respostaGirafa = scanner.nextLine();
        System.out.println("A girafa come "+respostaGirafa);
        
        scanner.close();
        
        return 0;
    }
}
