public class Questão6 {
    public static void main(String [] args){
        int num=1,resultado=1;
        while(num<=10){
        for(int rep=num;rep>=1;rep--){
            resultado = resultado*rep;
        }
        if(num==0 || num==1){
            System.out.println("Fatorial de "+num+": 1\n");
        } else {
            System.out.println("O Fatorial de "+num+" : "+resultado+"\n");  
        }
        resultado=1;
        num++;
        }
    }
}