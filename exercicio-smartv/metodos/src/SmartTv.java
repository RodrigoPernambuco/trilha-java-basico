public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Você ligou a TV");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Você desligou a TV");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("O volume aumentou para -> " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("O volume diminui para -> " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("O canal agora está no número -> " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("O canal agora está no número -> " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Você mudou o canal para o número -> " + canal);
    }
}