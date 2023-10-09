public class Questão7 {
    public static void main(String [] args){
        int valor = 13;
        while(valor!=1){
            if(valor%2==0){
                valor = valor/2;
            }else{
                valor = valor * 3 + 1;
            }
            System.out.println(valor + " ");
        }
    }
}