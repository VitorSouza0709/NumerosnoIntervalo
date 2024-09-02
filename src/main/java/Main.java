import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    // um programa que leia um valor inteiro N. Este Valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão fora do intervalo, mostrando essas informações;

    int quantidadeDeNunerosDigitados = sc.nextInt();
    int valoresDentroDoIntervalo = 0;
    int valoresForaDoIntervalo = 0;
    int numeroDigitado;

    for (int i = 0; i < quantidadeDeNumeros; i++) 
    {
      System.out.pritnln("Digite o valor a ser comparado");
      número Digitado = sc.nextInt();
      if( número Digitado >=10 && númeroDigitado <= 20) {
        valoresDentroDoIntervalo++;
      } else {
        valoresForaIntervalo++;
      }
    }
 System.out.println("dentro do intervalo temos: " + valoresDentroDoIntervalo);
 System.out.println("fora do intervalo temos: " + valoresForaDoIntervalo);
sc.close();
  }

  
}