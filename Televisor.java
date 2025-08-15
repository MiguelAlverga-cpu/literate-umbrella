public class Televisor {
    private int canal;
    private int volume; 
    private boolean ligado;

    //contrutor

    public Televisor(){
        this.canal = 1;
        this.volume = 15;
        this.ligado = false;
    }

    //metódos
    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

     public void aumentarVolume(){
        if (ligado && volume < 100){
            volume ++;
        }
    }

    public void diminuirVolume(){
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

 