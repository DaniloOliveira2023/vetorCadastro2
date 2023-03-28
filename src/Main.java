import java.util.Scanner;

public class Main {
    static int posicoesPreenchidas;

    public static void main(String[] args) {
        double numero[] = new double[5];
        boolean sair = false;
        int opcao;
        double[] valores;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Inserir número");
            System.out.println("2 - Exibir número");
            System.out.println("3 - Sair");
            opcao = s.nextInt();
            if (opcao == 1) {
                inserirNumero(numero);
            } else if (opcao == 2) {
                exibirVetor(numero);
            } else if (opcao == 3) {
                sair = true;
            } else {
                System.out.println("Valor inválido. Digite novamente.");
            }
        } while (opcao != 3);
    }

    public static void inserirNumero(double valores[]) {
        int novoNumero;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Digite o numero a ser inserido");
            if(posicoesPreenchidas<valores.length){
                double numero = s.nextDouble();
                if(buscarNumero(valores,  numero)==0){
                    valores[posicoesPreenchidas] = numero;
                    posicoesPreenchidas++;
                }else{
                    System.out.println("O numero já esta no vetor");
                }
            }else{
                System.out.println("O vetor esta cheio");
            }
            System.out.println("Deseja inserir um novo numero?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            novoNumero=s.nextInt();
            if(novoNumero!=1 &&novoNumero!=2){
                System.out.println("Numero invalido");
            }
        }while(novoNumero==1);

    }

    public static int buscarNumero(double[] valores, double numeroBuscado) {
        for (int i = 0; i < posicoesPreenchidas; i++) {
            if (valores[i] == numeroBuscado) {
                return 1;
            }
        }
        return 0;
    }
    public static void exibirVetor (double valores[]) {
            for (int i = 0; i < posicoesPreenchidas; i++) {
                System.out.println("Posição " + (i + 1) + " Número " + valores[i]);
            }
        }
}