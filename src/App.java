import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Requisito 1: Pedir dois numeros
        System.out.println("Adicione o primeiro numero para executar a soma: ");
        Scanner scanner = new Scanner(System.in);
        int primeiro = scanner.nextInt();

        System.out.println("Adicione o segundo numero para executar a soma: ");
        int segundo = scanner.nextInt();

        int soma = primeiro + segundo;
        scanner.close();

        // Requisito 2: Mostre a soma dos dois numeros
        System.out.print("A soma dos numeros informados será: " + soma);

    }
}
