import java.util.Scanner;
public class Exercicio2 {
    
    public static int soma(int inicio, int v1, int v2){

        int total = v1 + v2;

        if(inicio==total){
            return inicio;
        }else{
            inicio++;
            return soma(inicio, v1, v2);
        }
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int inicio = 1;
        int v1,v2;
        int resultado;

        System.out.println("Digite o valor 1: ");
        v1 = in.nextInt();
        System.out.println("Digite o valor 2: ");
        v2 = in.nextInt();

        resultado = soma(inicio, v1, v2);
        System.out.println(resultado);

        in.close();
    }
}
