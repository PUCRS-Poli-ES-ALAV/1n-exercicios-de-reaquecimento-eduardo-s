//1. Desenvolva algoritmos recursivos para os seguintes problemas e implemente-os (em Java, por exemplo):
// 1. Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
import java.util.Scanner;
public class Exercicio1 {

    public static void multiplicacao(int v1,int v2,int aux, int resultado){

        //int resultado=0;

        if(v1==aux){
            System.out.println(resultado);
        }else{
            resultado += v2;
            aux++;
            multiplicacao(v1, v2, aux, resultado);
        }

        //System.out.println(resultado);
    }

    public static void main(String[] args){

        multiplicacao(6, 4, 0,0);

    }
}