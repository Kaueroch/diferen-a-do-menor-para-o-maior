import java.util.Scanner;

/*******************************************************************************
 * 14) Escreva um programa que leia dois números e apresente a diferença do
 * maior para o menor.
 *******************************************************************************/
public class Main {
    public static void main(String[] args) {
    /* Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero maior");
   int maior = sc.nextInt();
        System.out.println("Digite um numero menor");
        int menor = sc.nextInt();
      int diferença = maior - menor;
      System.out.println("A diferença é " + diferença);
    */
        Scanner entrada = new Scanner(System.in);
        int PrimeiroNumero, SegundoNumero, Diferenca;

        System.out.print("Verificador de números\n\n");


        System.out.print("Digite o primeiro número:  ");
        PrimeiroNumero = entrada.nextInt();

        System.out.print("Digite o segundo número:  ");
        SegundoNumero = entrada.nextInt();


        if(PrimeiroNumero >= SegundoNumero){
            Diferenca = PrimeiroNumero - SegundoNumero;
        }else{
            Diferenca = SegundoNumero - PrimeiroNumero;
        }

        System.out.println("\nA diferença do menor para o menor é "+Diferenca);

    }
}
