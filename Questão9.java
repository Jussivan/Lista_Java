public class Questão9 {
    public static void main(String [] args){
        int salario = 800;
        System.out.println("O salário antes do aumento era: "+salario);
        if(salario<=280){
        System.out.println("A porcentagem de aumento foi de 20%");
        System.out.println("O valor aumentado foi de : " + salario * 0.2);
        System.out.println("O novo salário é : "+(salario+salario*0.2));
        }else if(salario<=700){
        System.out.println("A porcentagem de aumento foi de 15%");
        System.out.println("O valor aumentado foi de : " + salario * 0.15);
        System.out.println("O novo salário é : "+(salario+salario*0.15));
        }else if(salario<=1500){
        System.out.println("A porcentagem de aumento foi de 10%");
        System.out.println("O valor aumentado foi de : " + salario * 0.1);
        System.out.println("O novo salário é : "+(salario+salario*0.1));
        }else if(salario<1500){
        System.out.println("A porcentagem de aumento foi de 5%");
        System.out.println("O valor aumentado foi de : " + salario * 0.05);
        System.out.println("O novo salário é : "+(salario+salario*0.05));
        }
    }
}