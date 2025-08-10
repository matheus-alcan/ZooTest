import java.util.List;

public class ZooTest
{
    public void alimentar(List <Alimentavel> animal){
        for(Alimentavel a : animal){
            a.alimentação();
        }
    }
}
