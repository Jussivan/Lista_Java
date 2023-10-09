public class Questão4 {
    public static void main(String [] args){
        int valor = 11;
        int divisores = 0;
        for(int rep=1;rep<=valor;rep++){
            if(valor%rep==0){
                divisores++;
            }
        }
        if(divisores==2){
            System.out.println("É Primo.");
        } else {
            System.out.println("Não é Primo.");
        }
    }
}