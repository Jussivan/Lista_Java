public class Questão8 {
    public static void main(String [] args){
        int valor = 4;
        for(int rep=1;rep<=valor;rep++){
            for(int cont=1;cont<=rep;cont++){
                System.out.println(rep*cont);
            }
            System.out.println(" ");
        }
    }
}