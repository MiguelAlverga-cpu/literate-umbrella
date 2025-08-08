
import com.sun.source.tree.TreeVisitor;

public class ControleRemoto {
     private Televisor televisor;
   

    //contrutor

    public ControleRemoto (Televisor tv)
{
    this.televisor = tv;
}
       
    //metódos
    public void ligar(){
        televisor.ligar();
    }

    public void deslisgar(){
        televisor.deslisgar();
    }

     public void AumentarVolume(){
        if (ligado && volume < 100){
            volume ++;
        }
    }

    public void DiminuirVolume(){
        if (ligado && volume > 100){
            volume --;
        }
    }

    public void Trocarcanal(int Novocanal){
        if (ligado && Novocanal > 0){
            canal = Novocanal;
        }
    }
    // Método toString
    public String toString() {
        return "Televisor ligado: " + ligado + ",canal "+ canal + ",volume"+ volume ;
    
    }
    //gett e sett
    public int getCanal(){
        return volume;
    }
    
    public int getVolume(){
        return volume;
    }

    public boolean getligado  (){
        return ligado;
    }
        }
