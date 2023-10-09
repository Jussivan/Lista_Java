public class Questão5 {
    public static void main(String [] args){
        int Prim=0,Seg=1;
        for(int Prox=Prim+Seg;Prim<=100;){
            System.out.println(Prim + " ");
            Prim = Seg;
            Seg = Prox;
            Prox = Prim + Seg;
        }
    }
}