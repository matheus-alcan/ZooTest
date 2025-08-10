import java.util.List;
import java.util.ArrayList;

public class Lista
{
    public static void main(String[] args){
        Leao leao = new Leao();
        Girafa girafa = new Girafa();
        
        List<Alimentavel> animal = new ArrayList<Alimentavel>();
        
        animal.add(leao);
        animal.add(girafa);
        
        ZooTest alimenta = new ZooTest();
        
        alimenta.alimentar(animal);
    }
}